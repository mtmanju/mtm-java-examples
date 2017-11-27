package com.demo;

class SortingDemo {

    public static void main(String[] input) {
        String names[] = { "Pratistha", "Manju", "Nethra", "Preeti" };
        String temp;

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }

            System.out.println(names[i]);
        }
    }
}
