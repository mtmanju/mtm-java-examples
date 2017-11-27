package com.mtm.demo.ex.test;

import com.mtm.demo.ex.ConstructorOverlioading;

public class ConstructorOverlioadingTest {

    public static void main(String[] args) {
        ConstructorOverlioading mybox1 = new ConstructorOverlioading(10, 20, 15);
        ConstructorOverlioading mybox2 = new ConstructorOverlioading();
        ConstructorOverlioading mycube = new ConstructorOverlioading(7);
        double vol;
        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        // get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);

    }

}
