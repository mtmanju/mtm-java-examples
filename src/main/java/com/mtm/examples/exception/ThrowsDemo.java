package com.mtm.examples.exception;

import java.io.IOException;

public class ThrowsDemo {

    public static void main(String[] args) {
        ThrowsDemo td = new ThrowsDemo();
        ThrowsDemo.Inner inner = td.new Inner();
        try {
            inner.method();
        } catch (IOException e) {
            try {
                throw new IOException("Device error");
            } catch (IOException e1) {
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
