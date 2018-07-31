public class Table {
    protected String color;
    protected int height;

    public Table(String color, int height){
        this.color = color;
        this.height = height;
    }

    public void print(){
        System.out.println("Table color is - " + color);
        System.out.println("Table height is - " + height + "cm");
    }
}
