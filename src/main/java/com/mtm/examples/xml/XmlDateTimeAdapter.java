package com.mtm.examples.xml;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author ManjunathMT
 */
public class XmlDateTimeAdapter extends XmlAdapter<String, Date> {
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private final DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);

    public XmlDateTimeAdapter() {
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
