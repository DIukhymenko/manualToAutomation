package com.automation_boss.inventory;

import java.io.PrintStream;
import java.util.Objects;

public class Chair implements Inventory {
    protected String color;
    protected int legs;
    protected String shape;

    public Chair(String color, int legs, String shape) {
        this.color = color;
        this.legs = legs;
        this.shape = shape;
    }

    public void print(PrintStream out) {
        out.println("Chair color is - " + color);
        out.println("Legs count - " + legs);
        out.println("Chair shape is - " + shape);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Chair chair = (Chair) o;
        return legs == chair.legs && Objects.equals(color, chair.color) && Objects.equals(shape, chair.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, legs, shape);
    }

    @Override
    public String toString() {
        return "Chair{" + "color='" + color + '\'' + ", legs=" + legs + ", shape='" + shape + '\'' + '}';
    }
}
