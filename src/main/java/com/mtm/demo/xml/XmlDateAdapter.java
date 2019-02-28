package com.mtm.demo.xml;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author ManjunathMT
 *
 */
public class XmlDateAdapter extends XmlAdapter<String, Date> {
	private static final String DATE_FORMAT = "yyyy-MM-dd";
	private final DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);

	public XmlDateAdapter() {
		dateFormat.setLenient(false);
	}

	@Override
	public Date unmarshal(String xml) throws Exception {
		return dateFormat.parse(xml);
	}

	@Override
	public String marshal(Date object) throws Exception {
		return dateFormat.format(object);
	}
}
