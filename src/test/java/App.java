import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class App {
    public static void main(String args[]) {
        Table roomTable = new Table("green", 15);
        Chair roomChair = new Chair("red", 3, "bubble");
        Chair roomChair2 = new Chair("yellow", 13, "rectangle");
        Phone roomPhone = new Phone("mobile");
        AttendeesInventory a1 = new AttendeesInventory();
        AttendeesInventory a2 = new AttendeesInventory();
        a1.attInv2("fgh");
        Room r1 = new Room();
        System.out.println(r1.list.add(a1));
//        Thread.sleep(10000);
//        roomPhone.call("380990288777");
//        roomPhone.call("380674737213");
//        roomPhone.call("123123123");
//        System.out.println(roomPhone.batteryPercentage());
//        PrintStream myFile = new PrintStream(new FileOutputStream("we.txt", false));
//        Room rI = new Room();
//        rI.prCr(myFile, roomTable, roomChair, roomChair2);
    }
}
