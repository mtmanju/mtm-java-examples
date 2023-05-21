package com.mtm.examples.xml;


import jakarta.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author ManjunathMT
 */
public final class XmlTypeAdapter extends XmlAdapter<Object, Object> {

    /**
     * Noop. Just returns the object given as the argument.
     */
    public Object unmarshal(Object v) {
        return v;
    }

    /**
     * Noop. Just returns the object given as the argument.
     */
    public Object marshal(Object v) {
        return v;
    }
}
