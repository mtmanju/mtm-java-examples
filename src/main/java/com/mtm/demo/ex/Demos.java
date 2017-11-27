package com.mtm.demo.ex;

public class Demos {

    public String getListItemClassName(int index, int size) {
        String result = null;
        if (index % 4 == 0 && (index == size - 1)) {
            result = "first last";
        } else if (index % 4 == 0) {
            result = "first";
        } else if (((index + 1) % 4 == 0) || (index == size - 1)) {
            result = "last";
        }
        return result;
    }

    public static void main(String[] args) {
        Demos cbc = new Demos();
        System.out.println("Order:" + cbc.getListItemClassName(4, 6));

    }

}
