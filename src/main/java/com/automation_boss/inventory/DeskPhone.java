package com.automation_boss.inventory;

import java.io.*;
import java.util.Objects;

public class DeskPhone implements Phone {
    protected String phoneType;
    protected int callsCount;
    protected int weight;
    protected String color;

    public DeskPhone(String phoneType, int weight, String color) {
        this.phoneType = phoneType;
        this.weight = weight;
        this.color = color;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        DeskPhone deskPhone = (DeskPhone) o;
        return weight == deskPhone.weight && Objects.equals(color, deskPhone.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(weight, color);
    }

    @Override
    public String toString() {
        return "DeskPhone{" + "weight=" + weight + ", color='" + color + '\'' + '}';
    }
}