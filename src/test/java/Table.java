import java.io.PrintStream;

public class Table implements Inventory{
    protected String color;
    protected int height;


    public Table(String color, int height){
        this.color = color;
        this.height = height;
    }

    public void print(PrintStream out){
        out.println("Table color is - " + color);
        out.println("Table height is - " + height + "cm");
    }
}
