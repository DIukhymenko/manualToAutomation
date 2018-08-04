import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Room {

    List<AttendeesInventory> list = new ArrayList<AttendeesInventory>();

    public void prCr(PrintStream out, Inventory... inventory){
        for (Inventory inventories: inventory){
            inventories.print(out);
        }
    }
}
