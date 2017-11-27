package com.mtm.demo.nestedclasses;

interface Showable {

    void show();

    public interface Message {

        void msg();
    }
}

class NestedInterfaceDemo implements Showable, Showable.Message {

    public void msg() {
        System.out.println("Nested Interface: msg");
    }

    public void show() {
        System.out.println("Nested Interface: display");
    }

    public static void main(String[] args) {
        Showable.Message message = new NestedInterfaceDemo();
        message.msg();

        Showable show = new NestedInterfaceDemo();
        show.show();
    }

}
