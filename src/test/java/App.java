import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class App {
    public static void main(String args[]) throws FileNotFoundException, InterruptedException {
        Table roomTable = new Table("green", 15);
        Chair roomChair = new Chair("red", 3, "bubble");
        Chair roomChair2 = new Chair("yellow", 13, "rectangle");
        Laptop laptop1 = new Laptop("asd");
        Laptop laptop2 = new Laptop("TOSHIBA");
        Mobile mobile1 = new Mobile("rqqrqr");
        Mobile mobile2 = new Mobile("ERRICSON");
        Phone roomPhone = new Phone("mobile");
        Thread.sleep(10000);
        roomPhone.call("380990288777");
        roomPhone.call("380674737213");
        roomPhone.call("123123123");
        System.out.println(roomPhone.batteryPercentage());
        PrintStream myFile = new PrintStream(new FileOutputStream("test.txt", false));
        Attendee a1 = new Attendee(laptop1, mobile1);
        Attendee a2 = new Attendee(laptop2, mobile2);
        Room r1 = new Room(roomTable, new Chair[]{roomChair, roomChair2}, roomPhone);
        r1.join(a1);
        r1.describeInventory(myFile);
    }
}
