import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Room {
    final String table;
    final String chair;
    final int chairCount;
    final String phone;
    final List<Attendee> attendees;

    public Room(String table, String chair, int chairCount, String phone) {
        this.table = table;
        this.chair = chair;
        this.chairCount = chairCount;
        this.phone = phone;
        this.attendees = new ArrayList<Attendee>();
    }

    public void prCr(PrintStream out, Inventory... inventory) {
        for (Inventory inventories : inventory) {
            inventories.print(out);
        }
    }

    @Override public String toString() {
        return "Room{" + "table='" + table + '\'' + ", chair='" + chair + '\'' + ", chairCount=" + chairCount
                + ", phone='" + phone + '\'' + '}';
    }

    public void join(Attendee attendee) {
        this.attendees.add(attendee);
    }

}
