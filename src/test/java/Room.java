import java.io.*;

public class Room {
    String table;
    String chair;
    int chairCount;
    String phone;
    Attendee attendee;

    public Room(String table, String chair, int chairCount, String phone, Attendee attendee) {
        this.table = table;
        this.chair = chair;
        this.chairCount = chairCount;
        this.phone = phone;
        this.attendee = attendee;
    }

    public void prCr(PrintStream out, Inventory... inventory){
        for (Inventory inventories: inventory){
            inventories.print(out);
        }
    }

    @Override public String toString() {
        return "Room{" + "table='" + table + '\'' + ", chair='" + chair + '\'' + ", chairCount=" + chairCount
                + ", phone='" + phone + '\'' + ", attendee=" + attendee + '}';
    }
}
