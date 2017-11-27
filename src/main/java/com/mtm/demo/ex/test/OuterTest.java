package com.mtm.demo.ex.test;

import com.mtm.demo.ex.Airplane;

public class OuterTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Airplane.BlackBox box = new Airplane().new BlackBox();
        box.printVariables();
    }

}
