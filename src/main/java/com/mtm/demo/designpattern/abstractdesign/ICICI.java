package com.mtm.demo.designpattern.abstractdesign;

class ICICI implements Bank {

    private final String BNAME;

    ICICI() {
        BNAME = "ICICI BANK";
    }

    public String getBankName() {
        return BNAME;
    }
}
