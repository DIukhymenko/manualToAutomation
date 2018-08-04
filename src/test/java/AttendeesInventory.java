import java.io.PrintStream;

public class AttendeesInventory implements Inventory {
    String item1;
    int item2;
    boolean item3;

    public AttendeesInventory(String item1, int item2, boolean item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public void print(PrintStream out){
        out.println("Laptop - " + item1);
        out.println("Paper sheets - " + item2);
        if (item3) {
            out.println("I took my pan");
        } else {
            out.println("I forgot my pan");
        }
    }
}
