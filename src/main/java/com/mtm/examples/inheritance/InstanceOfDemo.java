package com.mtm.examples.inheritance;

class Animal {
}

class Cat extends Animal {

}

class Dog extends Animal {

    static void method(Animal a) {
        if (a instanceof Dog d) {
            // downcasting
            System.out.println("is a dog instance " + a);
            System.out.println("is a dog instance " + d);
        } else {
            System.out.println("not a dog instance " + a);
        }
    }
}

public class InstanceOfDemo extends Animal {

    public static void main(String[] args) {
        Animal aDog = new Dog();
        Dog.method(aDog);

        Animal aCat = new Cat();
        Dog.method(aCat);

        Dog d = (Dog) new Animal(); // Will throw class cast exception
        Dog.method(aCat);
    }

}