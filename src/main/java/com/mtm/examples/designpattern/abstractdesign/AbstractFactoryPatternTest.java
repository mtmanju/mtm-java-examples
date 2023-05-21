package com.mtm.examples.designpattern.abstractdesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class AbstractFactoryPatternTest {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of Bank (HDFC, ICICI, SBI) : ");
        String bankName = br.readLine();

        System.out.print("\n");
        System.out.print("Enter the type of loan (Home, Business, Education) : ");
        String loanName = br.readLine();


        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");
        double loanAmount = Double.parseDouble(br.readLine());

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = Objects.requireNonNull(bankFactory).getBank(bankName);
        System.out.print("\n");
        System.out.print("Enter the interest rate for " + bank.getBankName() + ": ");
        double interestRate = Double.parseDouble(br.readLine());

        System.out.print("\n");
        System.out.print("Enter the number of years to pay: ");
        int years = Integer.parseInt(br.readLine());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        if (null != loanFactory) {
            Loan loan = loanFactory.getLoan(loanName);
            loan.getInterestRate(interestRate);
            loan.calculateLoanPayment(loanAmount, years);
        }
    }
}
