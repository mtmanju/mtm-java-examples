package com.mtm.examples.designpattern.abstractdesign;

abstract class Loan {

    protected double rate;

    abstract void getInterestRate(double rate);

    public void calculateLoanPayment(double loanAmount, int years) {
        /*
         * to calculate the monthly loan payment i.e. EMI
         *
         * rate=annual interest rate/12*100; n=number of monthly installments; 1year=12 months. so,
         * n=years*12;
         */

        int n = years * 12;
        rate = rate / 1200;
        double EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanAmount;

        System.out.print("\n");
        System.out.println("Your monthly EMI is " + EMI + " for the amount " + loanAmount + " you have borrowed");
    }
}
