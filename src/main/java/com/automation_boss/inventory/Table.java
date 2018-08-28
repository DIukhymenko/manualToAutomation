package com.automation_boss.inventory;

import java.io.PrintStream;
import java.util.Objects;

public class Table implements Inventory {
    protected String color;
    protected int height;

    public Table(String color, int height) {
        this.color = color;
        this.height = height;
    }

    public void print(PrintStream out) {
        out.println("Table color is - " + color);
        out.println("Table height is - " + height + "cm");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Table table = (Table) o;
        return height == table.height && Objects.equals(color, table.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, height);
    }

    @Override
    public String toString() {
        return "Table{" + "color='" + color + '\'' + ", height=" + height + '}';
    }
}
