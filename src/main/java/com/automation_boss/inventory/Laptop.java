package com.automation_boss.inventory;

import java.io.PrintStream;
import java.util.Objects;

public class Laptop implements Inventory {
    protected String laptopName;
    protected int width;
    protected boolean isRetina;
    protected int batterySize;
    protected String color;
    protected int monitorSize;
    protected int ram;
    protected boolean isSSD;

    public Laptop(String laptopName, int width, boolean isRetina, int batterySize, String color, int monitorSize,
            int ram, boolean isSSD) {
        this.laptopName = laptopName;
        this.width = width;
        this.isRetina = isRetina;
        this.batterySize = batterySize;
        this.color = color;
        this.monitorSize = monitorSize;
        this.ram = ram;
        this.isSSD = isSSD;
    }

    public void print(PrintStream out) {
        out.println("Laptop - " + laptopName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Laptop laptop = (Laptop) o;
        return isRetina == laptop.isRetina && batterySize == laptop.batterySize && monitorSize == laptop.monitorSize
                && ram == laptop.ram && isSSD == laptop.isSSD;
    }

    @Override
    public int hashCode() {

        return Objects.hash(isRetina, batterySize, monitorSize, ram, isSSD);
    }

    @Override
    public String toString() {
        return "Laptop{" + "isRetina=" + isRetina + ", batterySize=" + batterySize + ", monitorSize=" + monitorSize
                + ", ram=" + ram + ", isSSD=" + isSSD + '}';
    }
}
