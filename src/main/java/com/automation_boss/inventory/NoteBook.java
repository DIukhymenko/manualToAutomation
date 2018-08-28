package com.automation_boss.inventory;

import java.io.PrintStream;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        NoteBook noteBook = (NoteBook) o;
        return sheetsCount == noteBook.sheetsCount && Objects.equals(notebook, noteBook.notebook) && Objects
                .equals(color, noteBook.color) && Objects.equals(material, noteBook.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notebook, sheetsCount, color, material);
    }

    @Override
    public String toString() {
        return "NoteBook{" + "notebook='" + notebook + '\'' + ", sheetsCount=" + sheetsCount + ", color='" + color
                + '\'' + ", material='" + material + '\'' + '}';
    }
}
