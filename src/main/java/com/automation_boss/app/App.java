package com.automation_boss.app;

import com.automation_boss.area.Room;
import com.automation_boss.attendies.Attendee;
import com.automation_boss.inventory.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class App {
    public static void main(String args[]) throws IOException, InterruptedException {
        Table roomTable = new Table("green", 15);
        Table roomTableNew = new Table("green", 15);
        Chair roomChair = new Chair("red", 3, "bubble");
        Chair roomChair2 = new Chair("yellow", 13, "rectangle");
        Chair roomChair3 = new Chair("yellow", 13, "rectangle");
        Laptop laptop1 = new Laptop("LAPTOP1", 12, true, 200, "yellow", 13, 2, true);
        Laptop laptop2 = new Laptop("LAPTOP1", 12, true, 200, "yellow", 13, 2, true);
        CellPhone mobile1 = new CellPhone("MOB1");
        CellPhone mobile2 = new CellPhone("MOB2");
        NoteBook firstNotebook = new NoteBook("Tetradka", 60, "yellow", "paper");
        NoteBook secondNotebook = new NoteBook("KrutaiaTetradka", 60, "yellow", "paper");
        PaperSheets firstSheetsSet = new PaperSheets(5, 50);
        PaperSheets secondSheetsSet = new PaperSheets(5, 50);
        DeskPhone roomDeskPhone = new DeskPhone("mobile");
        //        Thread.sleep(10000);
        //        roomDeskPhone.call("380990288777");
        //        roomDeskPhone.call("380674737213");
        //        roomDeskPhone.call("123123123");
        //        mobile1.call("8888888888");
        //        mobile1.call("777777");
        //        mobile1.call("6666666666");
        try {
            roomDeskPhone.contactsList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(mobile1.batteryPercentage());
        PrintStream myFile = new PrintStream(new FileOutputStream("test.txt", false));
        Attendee firstAttendee = new Attendee(mobile1, laptop1, firstNotebook);
        Attendee secondAttendee = new Attendee(laptop2, mobile2, firstSheetsSet);
        Room r1 = new Room(roomTable, new Chair[] { roomChair, roomChair2 }, roomDeskPhone);
        r1.join(firstAttendee);
        r1.join(secondAttendee);
        r1.describeInventory(myFile);
        if (roomChair.equals(roomChair2))
            System.out.println("true - " + roomChair.toString() + " - " + roomChair2.toString());
        else {
            System.out.println("false - " + roomChair.toString() + " - " + roomChair2.toString());
        }
        if (roomTable.equals(roomTableNew))
            System.out.println("true - " + roomTable.toString() + " - " + roomTableNew.toString());
        else {
            System.out.println("false - " + roomTable.toString() + " - " + roomTableNew.toString());
        }
        if (firstSheetsSet.equals(secondSheetsSet))
            System.out.println("true - " + firstSheetsSet.toString() + " - " + secondSheetsSet.toString());
        else {
            System.out.println("false - " + firstSheetsSet.toString() + " - " + secondSheetsSet.toString());
        }
        if (firstNotebook.equals(secondNotebook))
            System.out.println("true - " + firstNotebook.toString() + " - " + secondNotebook.toString());
        else {
            System.out.println("false - " + firstNotebook.toString() + " - " + secondNotebook.toString());
        }
        if (laptop1.equals(laptop2))
            System.out.println("true - " + laptop1.toString() + " - " + laptop2.toString());
        else {
            System.out.println("false - " + laptop1.toString() + " - " + laptop2.toString());
        }
    }
}
