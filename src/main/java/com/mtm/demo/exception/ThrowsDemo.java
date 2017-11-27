package com.mtm.demo.exception;

import java.io.IOException;

public class ThrowsDemo {

    public static void main(String[] args) {
        ThrowsDemo td = new ThrowsDemo();
        ThrowsDemo.Inner inner = td.new Inner();
        try {
            inner.method();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            try {
                throw new IOException("Device error");
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }

    class Inner {

        void method() throws IOException {
            throw new IOException("Device error");
        }
    }

}
