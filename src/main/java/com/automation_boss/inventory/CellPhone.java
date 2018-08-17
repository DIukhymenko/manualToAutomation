package com.automation_boss.inventory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

public class CellPhone implements Phone {
    protected String mobilePhone;
    protected int callReduce = 2;
    protected long battery = TimeUnit.HOURS.toMillis(1);
    protected int callsCount;
    long objectCreationDate;

    public CellPhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        this.objectCreationDate = System.currentTimeMillis();
    }

    public void call(String number) {
        System.out.println("Dialing from cellPhone - " + number);
        callsCount++;
    }

    public void contactsList() throws IOException {
        System.out.println("qwe");
    }

    public void print(PrintStream out) {
        out.println("mobile - " + mobilePhone);
    }

    public long batteryPercentage() {
        return ((100 * ((battery - (System.currentTimeMillis() - objectCreationDate)))) / battery) - (callsCount
                * callReduce);
    }

}
