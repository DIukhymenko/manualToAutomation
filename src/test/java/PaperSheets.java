import java.io.PrintStream;

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
}
