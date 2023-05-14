package com.mtm.demo.java8;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.stream.Stream;

class StreamsExampleCustomObjects {

	public static void main(String[] args) {

		// Case 1: Without filtering
		Stream.of(Employee.builder().id(1001).name("Manju").salary(10000L).build(),
				Employee.builder().id(1002).name("Smita").salary(20000L).build(),
				Employee.builder().id(1003).name("Kaustav").salary(30000L).build()).forEach(employee -> {
			System.out.println(employee);
				});

		// Case 2: With filtering
		System.out.println();
		Stream.of(Employee.builder().id(1001).name("Manju").salary(10000L).build(),
				Employee.builder().id(1002).name("Smita").salary(20000L).build(),
				Employee.builder().id(1003).name("Kaustav").salary(30000L).build())
				.filter(employee -> employee.getName().equals("Kaustav")).forEach(employee -> {
					System.out.println(employee);
				});

		// Case 3: With Sorting
		System.out.println();
		Stream.of(Employee.builder().id(1003).name("Manju").salary(10000L).build(),
				Employee.builder().id(1002).name("Smita").salary(20000L).build(),
				Employee.builder().id(1003).name("Kaustav").salary(30000L).build()).sorted().forEach(employee -> {
					System.out.println(employee);
				});

	}
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private Long salary;

	@Override
	public int compareTo(Employee employee) {
		if (this.id > employee.id) {
			return 1;
		}
		if (this.id < employee.id) {
			return -1;
		} else {
			return 0;
		}
	}
}