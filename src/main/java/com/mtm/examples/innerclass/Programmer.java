package com.mtm.examples.innerclass;

public class Programmer {

    private static int id;

    /**
     * End of Inner Class
     **/
    public static void main(String[] args) {
        Programmer.InnerProgrammer inner = new InnerProgrammer();
        inner.someInnerFunction();
        System.out.println("id: " + id);
        Programmer programmer = new Programmer();
        programmer.someOuterFunction();
    }

    private void someOuterFunction() {
        System.out.println("Inside private method of Outer class");
        InnerProgrammer inner = new InnerProgrammer();
        inner.someInnerFunction();
    }

    /**
     * InnerProgrammer : The Inner Class
     **/
    static class InnerProgrammer {

        private void someInnerFunction() {
            System.out.println("Inside private method of Inner class");
            Programmer.id = 176664;
        }
    }
}
