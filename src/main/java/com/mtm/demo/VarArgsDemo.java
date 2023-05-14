package com.mtm.demo;

public class VarArgsDemo {

    public static void main(String[] args) {
        VarArgsDemo varArgs = new VarArgsDemo();
        varArgs.display();
        varArgs.display("Manju");
        varArgs.display("Manju", "Preeti");
    }

    public void display(String... values) {
        System.out.println("Inside Dispaly...");
        for (String str : values) {
            System.out.println(str);
        }
        System.out.println();
    }

}
