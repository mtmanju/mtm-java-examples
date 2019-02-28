package com.mtm.demo.databene.benerator;

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
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import org.databene.benerator.engine.DefaultBeneratorContext;
import org.databene.benerator.primitive.datetime.DateTimeGenerator;
import org.databene.domain.address.Address;
import org.databene.domain.address.AddressGenerator;
import org.databene.domain.person.Person;
import org.databene.domain.person.PersonGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class GenerateData {
	private static final Logger LOGGER = LoggerFactory.getLogger(GenerateData.class);

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat timestampFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
	private static final AtomicInteger autoIncrement = new AtomicInteger(0);

	public static void main(String[] args) {
		LOGGER.info("Started at: " + timestampFormat.format(new Date(System.currentTimeMillis())));

		List<String> generatedList = GenerateData.generateData(2);
		LOGGER.info("Completed at: " + timestampFormat.format(new Date(System.currentTimeMillis())));
		LOGGER.info("Total Records Generated: " + generatedList.size());

		for (String str : generatedList) {
			LOGGER.info(str);
		}

		try {
			LOGGER.info("" + GenerateData.loadResources("test_6.json", GenerateData.class.getClassLoader()));
		} catch (IOException e) {
			LOGGER.error("", e);
		}

		// Retrieve resource
		String is = GenerateData.class.getResource("test_6.json").getFile();
		LOGGER.info(is.toString());
	}

	@SuppressWarnings({ "unused", "deprecation" })
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

				Template template = cfg.getTemplate("src/GenerateData.ftl");
				Map<String, String> data = new HashMap<String, String>();

				String[] applicationTypes = { "C", "B", "P" };
				String[] suppressionFlag = { "N", "Y" };
				String[] gamingFlag = { "N", "Y" };

				data.put("APPLICATION_DATE", dateFormat.format(date) + "");
				data.put("APPLICATION_TYPE", applicationTypes[random.nextInt(3)]);

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

				template.process(data, sw);
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
						LOGGER.error("", x);
					}
				}
			} catch (Exception e) {
				LOGGER.error("", e);
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
