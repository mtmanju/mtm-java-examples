package com.mtm.examples.date;

import org.apache.commons.lang3.time.DateUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ManjunathMT
 */
public class DateFormatUtils extends DateUtils {

    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    private DateFormatUtils() {
    }

    public static String formatDate(Date date) {
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        return df.format(date);
    }

    public static String formatDate(Date date, String format) {
        DateFormat df = new SimpleDateFormat(format);
        return df.format(date);
    }


    public static void main(String[] args) {

        System.out.println(formatDate(new Date()));

    }
}