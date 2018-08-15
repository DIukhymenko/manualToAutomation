package com.automation_boss.inventory;

import java.io.PrintStream;

public class CellPhone implements Inventory, Phone {
    protected String mobilePhone;

    public void call(String  number){
        System.out.println("Dialing from cellPhone - " + number);
    }

    public void contactsList(String... contacts) {
        for (String cont: contacts)
            System.out.println("Cell Phone contacts: " + cont);
    }

    public CellPhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void print(PrintStream out) {
        out.println("mobile - " + mobilePhone);
    }
}
