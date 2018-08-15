package com.automation_boss.inventory;

import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

public class DeskPhone implements Inventory, Phone{
    String phoneType;
    long battery = TimeUnit.HOURS.toMillis(1);
    int callsCount;
    int callReduce = 2;
    long objectCreationDate;

    public DeskPhone(String phoneType) {
        this.phoneType = phoneType;
        this.objectCreationDate = System.currentTimeMillis();
    }

    public void call(String number) {
        System.out.println("Dialing from Desk Phone - " + number);
        callsCount++;
    }

    public void contactsList(String... contacts) {
        for (String cont: contacts)
            System.out.println("Desk Phone contacts: " + cont);
    }

    public long batteryPercentage() {
        return ((100*((battery - (System.currentTimeMillis() - objectCreationDate))))/battery)  - (callsCount * callReduce);
    }

    public void print(PrintStream out){
        out.println("You have chosen " + phoneType + " phone");
    }
}
