package com.mtm.demo.shahash;

import java.security.MessageDigest;

public class SHAHashingExample {
    public static void main(String[] args) throws Exception {
        String password = "APP00JIO002";

        // JioMall = APP00JIO001 =
        // 18434B665A502C8FAF05CE4DE26288B132710B7A3F78D65C6673DB3124E32E9D

        // AJIO = APP00JIO002 =
        // 7CB4BDE41EED910C1CEC659225522E42BBE43A291764B2A4DCE5B9AE222C1D76

        // TRENDS = APP00JIO003 =
        // 0D4C82F9D037EA8BD771FA84649215514FD6D9CC749CCE32ECF3BC5D50427F21

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());

        byte[] byteData = md.digest();

        // convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        System.out.println("Hex format : " + sb.toString().toUpperCase());

        // convert the byte to hex format method 2
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() == 1)
                hexString.append('0');
            hexString.append(hex);
        }
        System.out.println("Hex format : " + hexString.toString().toUpperCase());
    }
}
