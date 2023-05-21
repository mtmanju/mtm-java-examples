package com.mtm.examples.retail;

public class Retail {

    public static void main(String[] args) {
        RegularCustomer regularCustomer = new RegularCustomer();
        PrivilegedCustomer privilegedCustomer = new PrivilegedCustomer();

        regularCustomer.setCustomerId(1001);
        regularCustomer.setDiscount(20.00f);

        privilegedCustomer.setCustomerId(2001);
        privilegedCustomer.setMemCardType("Gold");

        System.out.println("Regular Customer Details");
        System.out.println("Customer Id: " + regularCustomer.getCustomerId());
        System.out.println("Discount: " + regularCustomer.getDiscount());

        System.out.println("\nPrivileged Customer Details");
        System.out.println("Customer Id: " + privilegedCustomer.getCustomerId());
        System.out.println("Membership Card Type: " + privilegedCustomer.getMemCardType());

    }
}
