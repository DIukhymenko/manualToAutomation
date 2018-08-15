package com.automation_boss.inventory;

import java.io.PrintStream;

public class CellPhone implements Inventory {
    protected String mobilePhone;

    public CellPhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void print(PrintStream out) {
        out.println("mobile - " + mobilePhone);
    }
}
