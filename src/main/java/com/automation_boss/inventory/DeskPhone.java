package com.automation_boss.inventory;

import java.io.PrintStream;

public class DeskPhone implements Inventory, Phone {
    String phoneType;
    int callsCount;

    public DeskPhone(String phoneType) {
        this.phoneType = phoneType;
    }

    public void call(String number) {
        System.out.println("Dialing from Desk Phone - " + number);
        callsCount++;
    }

    public void contactsList(String... contacts) {
        for (String cont : contacts)
            System.out.println("Desk Phone contacts: " + cont);
    }

    public void print(PrintStream out) {
        out.println("You have chosen " + phoneType + " phone");
    }
}
