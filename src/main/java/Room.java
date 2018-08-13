import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Room {
    final Table table;
    final Chair[] chairs;
    final Phone phone;
    final List<Attendee> attendees;

    public Room(Table table, Chair[] chair, Phone phone) {
        this.table = table;
        this.chairs = chair;
        this.phone = phone;
        this.attendees = new ArrayList<Attendee>();
    }

    public void join(Attendee attendee) {
        this.attendees.add(attendee);
    }

    public void describeInventory(PrintStream output) {
        table.print(output);
        for (Chair roomChair: chairs){
            roomChair.print(output);
        }
        phone.print(output);
        for (Attendee attendee: attendees){
            for (Inventory item: attendee.inventory()){
             item.print(output);
            }
        }
    }
}
