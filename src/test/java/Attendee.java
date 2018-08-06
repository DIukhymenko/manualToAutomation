import java.util.ArrayList;
import java.util.List;

public class Attendee {
    private String name;
    private String laptop;
    private int sheetsCounts;

    public Attendee(String name, String laptop, int sheetsCounts) {
        this.name = name;
        this.laptop = laptop;
        this.sheetsCounts = sheetsCounts;
    }

    @Override public String toString() {
        return "Attendee{" + "name='" + name + '\'' + ", laptop='" + laptop + '\'' + ", sheetsCounts=" + sheetsCounts
                + '}';
    }

    public void attInv2(String name) {
            System.out.println(name);
        }
}
