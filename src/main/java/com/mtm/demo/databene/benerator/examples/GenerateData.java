package com.mtm.demo.databene.benerator.examples;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang.time.DateUtils;
import org.databene.benerator.engine.DefaultBeneratorContext;
import org.databene.benerator.primitive.datetime.DateTimeGenerator;
import org.databene.benerator.util.RandomUtil;
import org.databene.domain.address.Address;
import org.databene.domain.address.AddressGenerator;
import org.databene.domain.person.Person;
import org.databene.domain.person.PersonGenerator;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class GenerateData {

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat timestampFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
	private static final AtomicInteger autoIncrement = new AtomicInteger(0);

	public static void main(String[] args) {

		System.out.println("Started at: " + timestampFormat.format(new Date(System.currentTimeMillis())));

		List<String> generatedList = GenerateData.generateData(10);

		System.out.println("Completed at: " + timestampFormat.format(new Date(System.currentTimeMillis())));
		System.out.println("Total Records Generated: " + generatedList.size());

		for (String str : generatedList) {
			System.out.println(str);
		}

		try {
			System.out.println(GenerateData.loadResources("test_6.json", GenerateData.class.getClassLoader()));
		} catch (IOException e) {
			System.err.println(e);
		}

		// Retrieve resource
		String is = GenerateData.class.getResource("test_6.json").getFile();
		System.out.println(is.toString());
	}

	public static List<String> generateData(int noOfRecordsToGenerate) {
		List<String> generatedDataList = new ArrayList<String>();
		for (int i = 0; i < noOfRecordsToGenerate; i++) {
			String generatedData = "";
			int count = 100000000 + autoIncrement.incrementAndGet();
			PersonGenerator personGenerator = new PersonGenerator();
			AddressGenerator addressGenerator = new AddressGenerator();
			DateTimeGenerator dateGenerator = new DateTimeGenerator();

			try {
				Configuration cfg = new Configuration();
				StringWriter sw = new StringWriter();

				Random random = new Random();

				dateGenerator.init(new DefaultBeneratorContext());
				Date date = dateGenerator.generate();
				dateGenerator.setMaxDate(date);

				personGenerator.init(new DefaultBeneratorContext());
				Person person = personGenerator.generate();

				addressGenerator.init(new DefaultBeneratorContext());
				Address address = addressGenerator.generate();

				Template template = cfg.getTemplate("src/main/resources/GenerateData.ftl");
				Map<String, String> data = new HashMap<String, String>();

				String[] applicationTypes = { "C", "B", "P" };
				String[] suppressionFlag = { "N", "Y" };
				String[] gamingFlag = { "N", "Y" };

				data.put("APPLICATION_DATE", dateFormat.format(date) + "");
				data.put("APPLICATION_TYPE", applicationTypes[random.nextInt(3)]);
				data.put("CR_DECSN_CONSUMER_SURR_ID", RandomUtil.randomInt(1000000, 1100000) + "");

				data.put("INCOMING_CRID", Calendar.getInstance().get(Calendar.YEAR) + ""
						+ Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + "" + count + "");
				data.put("SSN_ENCRYPT", random.nextInt(100000) + "");
				data.put("ORIGINAL_CRID", Calendar.getInstance().get(Calendar.YEAR) + ""
						+ Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + "" + count + "");

				// Customer Details
				data.put("FULL_NAME", person.getGivenName() + " " + person.getFamilyName() + "");
				data.put("TITLE", person.getTitle() + "");
				data.put("FIRST_NAME", person.getGivenName() + "");
				data.put("MIDDLE_INITIAL", person.getSecondGivenName() + "");
				data.put("LAST_NAME", person.getFamilyName() + "");
				data.put("SUFFIX", "X");

				// Address Details
				data.put("ADDRESS_LINE1", address.getHouseNumber() + "");
				data.put("ADDRESS_LINE2", address.getStreet() + "");
				data.put("ZIP", address.getPostalCode() + "");
				data.put("ZIP4", address.getPostalCode() + "");
				data.put("CITY", address.getCity() + "");
				data.put("STATE", address.getState() + "");
				data.put("BIRTH_DT", dateFormat.format(person.getBirthDate()) + "");

				data.put("SUPPRESSION_FLAG", suppressionFlag[random.nextInt(2)] + "");
				data.put("FINAL_CREDIT_CLASS", "0");
				data.put("CREDIT_CLASS_PORT_IN", "0");
				data.put("CREDIT_CLASS_WOUT_PORT_IN", "0");
				data.put("COUNTER", "0");
				data.put("CHANNEL", random.nextInt(1000) + "");
				data.put("EFFECTIVE_DT", dateFormat.format(date) + "");
				data.put("EXPIRATION_DT", dateFormat.format(DateUtils.addMonths(date, 2)) + "");
				data.put("TRANSACTION_TIMESTAMP", timestampFormat.format(date) + "");
				data.put("PROMOTIONAL_CODE", "0");
				data.put("INDV_ID", "0");
				data.put("CCID", "");
				data.put("GAMING_DUP_COUNTER", "0");
				data.put("GAMING_FLAG", gamingFlag[random.nextInt(2)] + "");
				data.put("SSN_VALID_FLAG", "X");

				template.process(data, sw);
				// template.process(data, out);
				// out.flush();

				generatedData = sw.toString();

				generatedDataList.add(generatedData);
				if (count % 5 == 0) {
					generatedDataList.add(generatedData);

					File file = new File(GenerateData.class.getResource("").getPath());
					Path p = Paths.get(file.getAbsolutePath() + "/test_" + autoIncrement.incrementAndGet() + ".json");

					try {
						OutputStream out = new BufferedOutputStream(Files.newOutputStream(p,
								StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE));
						out.write(generatedData.getBytes());
						out.flush();
					} catch (IOException x) {
						System.err.println(x);
					}
				}
			} catch (Exception e) {
				System.err.println(e);
			} finally {
				personGenerator.close();
				addressGenerator.close();
				dateGenerator.close();
			}
		}
		return generatedDataList;
	}

	public static List<InputStream> loadResources(final String name, final ClassLoader classLoader) throws IOException {
		final List<InputStream> list = new ArrayList<InputStream>();
		final Enumeration<URL> systemResources = (classLoader == null ? ClassLoader.getSystemClassLoader()
				: classLoader).getResources(name);

		while (systemResources.hasMoreElements()) {
			list.add(systemResources.nextElement().openStream());
		}
		return list;
	}

}
