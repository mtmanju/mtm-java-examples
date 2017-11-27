package com.mtm.demo.designpattern;

public class AdapterDesignPattern {

	public String secretFormula(String param) {
		return "Secret o/p :" + param;
	}

	class Adapter extends AdapterDesignPattern {

		public String secretFormula(float param) {
			return super.secretFormula(String.valueOf(param));
		}
	}

}
