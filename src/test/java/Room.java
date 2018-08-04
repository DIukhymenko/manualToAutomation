import java.io.*;

public class Room {

    public void prCr(PrintStream out, Inventory... inventory){
        for (Inventory inventories: inventory){
            inventories.print(out);
        }
    }
}
