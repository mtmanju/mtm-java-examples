package com.demo.stringhandling;

public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Manju ");
        str.append("M T");

        System.out.println(str);
        
        str.insert(6, "MTM ");
        System.out.println(str);
        
        str.replace(6,9, "Nethra");
        System.out.println(str);
        
        str.delete(6,13);
        System.out.println(str);
        
        str.reverse();
        System.out.println(str);
    }
}
