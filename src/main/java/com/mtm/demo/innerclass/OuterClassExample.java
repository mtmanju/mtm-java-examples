package com.mtm.demo.innerclass;

public class OuterClassExample {

    String code = "11";

    public static void main(String[] args) {
        OuterClassExample.InnerClass inner = new OuterClassExample().new InnerClass();
        inner.printVariables();
    }

    public class InnerClass {
        String code = "22";

        public void printVariables() {
            System.out.println(code);
            System.out.println(OuterClassExample.this.code);
        }
    }
}
