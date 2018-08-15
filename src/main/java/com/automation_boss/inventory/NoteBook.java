package com.automation_boss.inventory;

import java.io.PrintStream;

public class NoteBook implements Inventory {
    protected String notebook;
    protected int sheetsCount;
    protected String color;
    protected String material;

    public NoteBook(String notebook, int sheetsCount, String color, String material) {
        this.notebook = notebook;
        this.sheetsCount = sheetsCount;
        this.color = color;
        this.material = material;
    }

    public void print(PrintStream out) {
        out.println("notebook - " + notebook);
        out.println("sheetsCount - " + sheetsCount);
        out.println("color is " + color);
        out.println("material - " + material);
    }
}
