package com.demo.inheritance;

class SuperGeek {

    public final int iqLevel = 100;
    public String[] degrees = { "M.S", "Ph.D." };
    private String str = "Some other property.";

    public void talkGeekyCrap() {
        System.out.println(str);
    }

}

class SheldonCooper extends SuperGeek {

    // Sheldon automatically gets the iqLevel 100 and all the degrees extended
    // and he can talk all geeky crap too
    /**
     * Sheldon’s private friends, won’t be shared with any class extending SheldonCooper
     * */
    private String[] friends = { "Leonard", "Rajesh", "Howard", "Penny" };

    @SuppressWarnings("unused")
    private void buildRocket() {
        for (String str : friends) {
            System.out.println(str);
        }
    }
}

public class GeekyDemo {

    public static void main(String[] args) {
        SheldonCooper obj = new SheldonCooper();
        System.out.println(obj.iqLevel);
        System.out.println(obj.degrees);
        obj.talkGeekyCrap();

        // obj.buildRocket(); //Compiler error bcz private method not visible

    }
}
