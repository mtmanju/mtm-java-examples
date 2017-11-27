package com.mtm.demo.designpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryDesignPattern {

	public static void main(String args[]) throws IOException {
		GetPlanFactory planFactory = new GetPlanFactory();

		System.out.print("Enter the name of plan { COMMERCIAL or DOMESTIC or INSTITUTIONAL } : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String planName = br.readLine();
		System.out.print("Enter the number of units for bill will be calculated: ");
		int units = Integer.parseInt(br.readLine());

		Plan p = planFactory.getPlan(planName);
		// call getRate() method and calculateBill() method of DomesticPaln.

		System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
		p.getRate();
		p.calculateBill(units);
	}
}

// abstarct class
abstract class Plan {

	protected double rate;

	abstract void getRate();

	public void calculateBill(int units) {
		System.out.println(units * rate);
	}
}

// concrete classes extending abstract class
class DomesticPlan extends Plan {

	public void getRate() {
		rate = 4;
	}
}

class CommercialPlan extends Plan {

	public void getRate() {
		rate = 7.50;
	}
}

class InstitutionalPlan extends Plan {

	public void getRate() {
		rate = 5.50;
	}
}

// Create Factory to generate object of concrete classes based on given
// information
class GetPlanFactory {

	// use getPlan method to get object of type Plan
	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DOMESTIC")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("COMMERCIAL")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("INSTITUTIONAL")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}