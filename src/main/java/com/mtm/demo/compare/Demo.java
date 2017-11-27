package com.mtm.demo.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Employee> myEmpList = new ArrayList<>();
		Employee emp = new Employee();
		emp.salary = 5000;
		emp.name = "Manju";
		myEmpList.add(emp);

		emp = new Employee();
		emp.salary = 15000;
		emp.name = "Nethra";
		myEmpList.add(emp);

		emp = new Employee();
		emp.salary = 500;
		emp.name = "Brad";
		myEmpList.add(emp);

		Collections.sort(myEmpList, new SalaryComparator());

	}
}
