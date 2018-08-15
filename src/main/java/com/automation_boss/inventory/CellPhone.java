package com.automation_boss.inventory;

import java.io.PrintStream;

public class CellPhone implements Inventory, Phone {
    protected String mobilePhone;

    public void call(String  number){
        System.out.println("Dialing from cellPhone - " + number);
    }

    public CellPhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void print(PrintStream out) {
        out.println("mobile - " + mobilePhone);
    }
}
