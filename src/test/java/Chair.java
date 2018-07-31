public class Chair {
    protected String color;
    protected int legs;
    protected String shape;

    public Chair(String color, int legs, String shape) {
        this.color = color;
        this.legs = legs;
        this.shape = shape;
    }

    public void print(){
        System.out.println("Chair color is - " + color);
        System.out.println("Legs count - " + legs);
        System.out.println("Chair shape is - " + shape);
    }
}
