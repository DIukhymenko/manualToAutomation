package inventory;

import java.io.PrintStream;

public class Table implements Inventory{
    protected String color;
    protected int height;


    public Table(String color, int height){
        this.color = color;
        this.height = height;
    }

    public void print(PrintStream out){
        out.println("inventory.Table color is - " + color);
        out.println("inventory.Table height is - " + height + "cm");
    }
}
