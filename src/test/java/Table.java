import java.io.PrintStream;

public class Table implements Creature{
    protected String color;
    protected int height;

    public Table(String color, int height){
        this.color = color;
        this.height = height;
    }

    public void print(PrintStream out){
        System.out.println("Table color is - " + color);
        System.out.println("Table height is - " + height + "cm");
    }
}
