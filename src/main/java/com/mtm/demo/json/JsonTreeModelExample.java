package com.mtm.demo.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class JsonTreeModelExample {

	public static void main(String[] a) throws IOException {
		try (InputStream inputStream = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("sample.json")) {
			JsonNode rootNode = new ObjectMapper().readTree(inputStream);

			System.out.println("Employee Id: " + rootNode.path("emp_id").asInt());
			System.out.println("Employee Name: " + rootNode.path("emp_name").asText());

			Iterator<JsonNode> itr = rootNode.path("direct_reports").elements();
			System.out.println("\nDirect Reports:");
			while (itr.hasNext()) {
				System.out.println(itr.next().asText());
			}
		}
	}
}