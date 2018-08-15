package com.automation_boss.app;

import com.automation_boss.area.Room;
import com.automation_boss.attendies.Attendee;
import com.automation_boss.inventory.*;

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
        CellPhone mobile1 = new CellPhone("MOB1");
        CellPhone mobile2 = new CellPhone("MOB2");
        NoteBook firstNotebook = new NoteBook("Tetradka", 60, "yellow", "paper");
        PaperSheets firstSheetsSet = new PaperSheets(5, 50);
        DeskPhone roomDeskPhone = new DeskPhone("mobile");
//        Thread.sleep(10000);
//        roomDeskPhone.call("380990288777");
//        roomDeskPhone.call("380674737213");
        roomDeskPhone.call("123123123");
        mobile1.call("8888888888");
        roomDeskPhone.contactsList("Vasya", "Petya");
        mobile1.contactsList("qwe", "qwe", "afssfaf");
//        System.out.println(roomDeskPhone.batteryPercentage());
//        PrintStream myFile = new PrintStream(new FileOutputStream("test.txt", false));
//        Attendee firstAttendee = new Attendee(mobile1, laptop1, firstNotebook);
//        Attendee secondAttendee = new Attendee(laptop2, mobile2, firstSheetsSet);
//        Room r1 = new Room(roomTable, new Chair[]{roomChair, roomChair2}, roomDeskPhone);
//        r1.join(firstAttendee);
//        r1.join(secondAttendee);
//        r1.describeInventory(myFile);
    }
}
