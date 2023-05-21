package com.mtm.examples.ex;

public class Airplane {

    String code = "11";

    public class BlackBox {

        String code = "22";

        public void printVariables() {
            System.out.println(code);
            System.out.println(Airplane.this.code);
        }
    }

}