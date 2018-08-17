package com.automation_boss.inventory;

import java.io.*;

public class DeskPhone implements Phone {
    String phoneType;
    int callsCount;

    public DeskPhone(String phoneType) {
        this.phoneType = phoneType;
    }

    public void call(String number) {
        System.out.println("Dialing from Desk Phone - " + number);
        callsCount++;
    }

    public void contactsList() throws IOException {
        File fileWithContacts = new File("src/main/resources/contactsList.txt");
        BufferedReader b = new BufferedReader(new FileReader(fileWithContacts));
        String readLine = "";
        System.out.println("Reading file using Buffered Reader");
        while ((readLine = b.readLine()) != null) {
            System.out.println(readLine);
        }
    }

    public void print(PrintStream out) {
        out.println("You have chosen " + phoneType + " phone");
    }
}
