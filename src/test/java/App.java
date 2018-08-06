import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String args[]) throws FileNotFoundException, InterruptedException {
        Table roomTable = new Table("green", 15);
        Chair roomChair = new Chair("red", 3, "bubble");
        Chair roomChair2 = new Chair("yellow", 13, "rectangle");
        Phone roomPhone = new Phone("mobile");
                Thread.sleep(10000);
                roomPhone.call("380990288777");
                roomPhone.call("380674737213");
                roomPhone.call("123123123");
                System.out.println(roomPhone.batteryPercentage());
        PrintStream myFile = new PrintStream(new FileOutputStream("test.txt", false));
        Attendee a1 = new Attendee("Jhon", "MAC", 4);
        Room r1 = new Room(roomTable, new Chair[]{roomChair, roomChair2}, roomPhone);
        r1.join(a1);
        r1.describeInventory(myFile);
    }
}
