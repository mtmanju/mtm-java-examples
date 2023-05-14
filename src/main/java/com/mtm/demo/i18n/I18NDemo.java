package com.mtm.demo.i18n;

import java.util.Locale;

public class I18NDemo {

    public static void main(String[] args) {
       // Locale locale = Locale.getDefault();
         Locale locale=new Locale("in","in");//for the specific locale

        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayName());
        System.out.println(locale.getISO3Country());
        System.out.println(locale.getISO3Language());
        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

    }
}
