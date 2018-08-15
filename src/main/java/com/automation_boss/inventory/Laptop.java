package com.automation_boss.inventory;

import java.io.PrintStream;

public class Laptop implements Inventory {
    protected String laptop;

    public Laptop(String laptop) {
        this.laptop = laptop;
    }

    public void print(PrintStream out) {
        out.println("Laptop - " + laptop);
    }
}
