package app;

import attendies.Attendee;
import inventory.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class App {
    public static void main(String args[]) throws FileNotFoundException, InterruptedException {
        Table roomTable = new Table("green", 15);
        Chair roomChair = new Chair("red", 3, "bubble");
        Chair roomChair2 = new Chair("yellow", 13, "rectangle");
        Laptop laptop1 = new Laptop("LAPTOP1");
        Laptop laptop2 = new Laptop("LAPTOP2");
        Mobile mobile1 = new Mobile("MOB1");
        Mobile mobile2 = new Mobile("MOB2");
        NoteBook firstNotebook = new NoteBook("Tetradka", 60, "yellow", "paper");
        PaperSheets firstSheetsSet = new PaperSheets(5, 50);
        Phone roomPhone = new Phone("mobile");
        Thread.sleep(10000);
        roomPhone.call("380990288777");
        roomPhone.call("380674737213");
        roomPhone.call("123123123");
        System.out.println(roomPhone.batteryPercentage());
        PrintStream myFile = new PrintStream(new FileOutputStream("test.txt", false));
        Attendee firstAttendee = new Attendee(mobile1, laptop1, firstNotebook);
        Attendee secondAttendee = new Attendee(laptop2, mobile2, firstSheetsSet);
        Room r1 = new Room(roomTable, new Chair[]{roomChair, roomChair2}, roomPhone);
        r1.join(firstAttendee);
        r1.join(secondAttendee);
        r1.describeInventory(myFile);
    }
}
