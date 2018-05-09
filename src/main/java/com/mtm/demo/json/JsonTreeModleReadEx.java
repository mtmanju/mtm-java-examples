package com.mtm.demo.json;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTreeModleReadEx {

	public static void main(String a[]) {

		ObjectMapper mapper = new ObjectMapper();
		try {
			// reading json input from the file and mapping to object
			File jsonInputFile = new File("/Users/java2novice/jsonInput.txt");

			JsonNode rootNode = mapper.readTree(jsonInputFile);
			// read employee id
			JsonNode empId = rootNode.path("emp_id");
			System.out.println(empId.asInt());
			// read employee name
			JsonNode empName = rootNode.path("emp_name");
			System.out.println(empName.asText());
			// read direct reports
			JsonNode drNode = rootNode.path("direct_reports");
			Iterator<JsonNode> itr = drNode.elements();
			System.out.println("\nDirect reports:");
			while (itr.hasNext()) {
				JsonNode temp = itr.next();
				System.out.println(temp.asText());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}