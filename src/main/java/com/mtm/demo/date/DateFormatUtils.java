package com.mtm.demo.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

/**
 * @author ManjunathMT
 *
 */
public class DateFormatUtils extends DateUtils {

	private DateFormatUtils() {
	}

	private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

	public static String formatDate(Date date) {
		DateFormat df = new SimpleDateFormat(DATE_FORMAT);
		return df.format(date);
	}

	public static String formatDate(Date date, String format) {
		DateFormat df = new SimpleDateFormat(format);
		return df.format(date);
	}
	

	public static void main(String[] args) {
	}
}