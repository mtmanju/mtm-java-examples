package com.mtm.examples;

class EnumTest {

    public static void main(String[] args) {

        Day day = Day.MONDAY;

        switch (day) {
            case SUNDAY:
                System.out.println("sunday");
                break;
            case MONDAY:
                System.out.println("monday");
                break;
            default:
                System.out.println("other day");
        }

    }

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
}
