package com.mtm.demo.xml;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class XMLDemoBuilder {

	@Test
	public void testXMLBuilder() throws Exception {
		XMLDemoBuilder xmlDemoBuilder = new XMLDemoBuilder();
		String xmlString = xmlDemoBuilder.generateEmployeeDetailsXML();
		System.out.println("XML String: " + xmlString);
	}

	public String generateEmployeeDetailsXML() throws Exception {
		String[] xmlTags = null;
		String[] xmlData = null;

		boolean generateEmptyTag = true;

		final Document doc = newDocument();
		final Element parentElement = doc.createElement("CANDIDATE_DETAILS");
		final Element detailElement = doc.createElement("DETAILS");
		final Element rowElement = doc.createElement("ROW");

		xmlTags = new String[] { "EMPLOYEE_NAME", "QUALIFICATION", "PERCENTAGE" };

		List<String> percentages = new ArrayList<>();
		percentages.add("71");
		percentages.add("72");

		xmlData = new String[] { "MANJUNATH.M.T", "BE", "70.0 %" };

		appendChildXMLElements(generateEmptyTag, doc, rowElement, xmlTags, xmlData);

		final Element itemsListElement = doc.createElement("ITEMS");
		xmlTags = new String[] { "PERCENTAGE", "Name" };

		for (String percentage : percentages) {
			Element rowElementInside = doc.createElement("ITEM");
			itemsListElement.appendChild(rowElementInside);
			xmlData = new String[] { percentage, "name" };

			appendChildXMLElements(generateEmptyTag, doc, rowElementInside, xmlTags, xmlData);
		}

		detailElement.appendChild(rowElement);
		detailElement.appendChild(itemsListElement);
		parentElement.appendChild(detailElement);
		doc.appendChild(parentElement);

		final String xmlString = generateXML(doc);
		return xmlString;
	}

	private static Document newDocument() throws ParserConfigurationException {
		final DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		final DocumentBuilder builder = builderFactory.newDocumentBuilder();
		return builder.newDocument();
	}

	private static void appendChildXMLElements(boolean generateEmptyTag, Document doc, Element rowElement,
			String[] xmlTags, String[] xmlData) throws Exception {
		if (xmlTags == null || xmlData == null || xmlTags.length != xmlData.length) {
			throw new Exception("xmlTags or data are null, or lenghts do not match.");
		}
		Element tempElement = null;
		for (int i = 0; i < xmlTags.length; i++) {
			if (xmlTags[i] != null && (generateEmptyTag || xmlData[i] != null)) {
				tempElement = doc.createElement(xmlTags[i]);
				tempElement.appendChild(doc.createTextNode((xmlData[i] == null ? "" : xmlData[i])));
				rowElement.appendChild(tempElement);
			}
		}
	}

	private static String generateXML(Document doc) throws TransformerFactoryConfigurationError, TransformerException {
		final StringWriter sw = new StringWriter();
		final StreamResult sr = new StreamResult(sw);
		final Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.transform(new DOMSource(doc), sr);
		sw.flush();
		return sw.toString();
	}

}
