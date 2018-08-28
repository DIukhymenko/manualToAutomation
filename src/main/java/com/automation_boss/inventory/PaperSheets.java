package com.automation_boss.inventory;

import java.io.PrintStream;
import java.util.Objects;

public class PaperSheets implements Inventory {
    protected int count;
    protected int density;

    public PaperSheets(int count, int density) {
        this.count = count;
        this.density = density;
    }

    public void print(PrintStream out) {
        out.println(count + " paper sheets with density = " + density);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PaperSheets that = (PaperSheets) o;
        return count == that.count && density == that.density;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, density);
    }

    @Override
    public String toString() {
        return "PaperSheets{" + "count=" + count + ", density=" + density + '}';
    }
}
