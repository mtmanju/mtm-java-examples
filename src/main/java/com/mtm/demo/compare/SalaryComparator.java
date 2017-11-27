package com.mtm.demo.compare;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class SalaryComparator implements Comparator {

	@Override
	public int compare(Object e1, Object e2) {
		return ((Employee) e1).salary - ((Employee) e2).salary;
	}

}
