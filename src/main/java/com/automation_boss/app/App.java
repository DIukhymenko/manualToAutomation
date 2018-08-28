package com.automation_boss.app;

import com.automation_boss.area.Room;
import com.automation_boss.attendies.Attendee;
import com.automation_boss.inventory.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class App {
        public void comparisonMethod(Inventory firstElement, Inventory secondElement){
            System.out.println(firstElement.equals(secondElement) + " - " + firstElement + " - " + secondElement);
        }

    public static void main(String args[]) throws IOException, InterruptedException {
        Table roomTable = new Table("green", 15);
        Table roomTableNew = new Table("green", 15);
        Chair roomChair = new Chair("red", 3, "bubble");
        Chair roomChair2 = new Chair("yellow", 13, "rectangle");
        Chair roomChair3 = new Chair("yellow", 13, "rectangle");
        Laptop laptop1 = new Laptop("LAPTOP1", 12, true, 200, "yellow", 13, 2, true);
        Laptop laptop2 = new Laptop("LAPTOP1", 12, true, 200, "yellow", 13, 2, true);
        CellPhone mobile1 = new CellPhone("MOB1", true, 100, false);
        CellPhone mobile2 = new CellPhone("MOB1", false, 100, false);
        NoteBook firstNotebook = new NoteBook("Tetradka", 60, "yellow", "paper");
        NoteBook secondNotebook = new NoteBook("KrutaiaTetradka", 60, "yellow", "paper");
        PaperSheets firstSheetsSet = new PaperSheets(5, 50);
        PaperSheets secondSheetsSet = new PaperSheets(5, 50);
        DeskPhone roomDeskPhone = new DeskPhone("mobile", 23, "blac1k");
        DeskPhone roomDeskPhone2 = new DeskPhone("mobile", 23, "black");
        Thread.sleep(10000);
        roomDeskPhone.call("380990288777");
        roomDeskPhone.call("380674737213");
        roomDeskPhone.call("123123123");
        mobile1.call("8888888888");
        mobile1.call("777777");
        mobile1.call("6666666666");
        App cM = new App();
        cM.comparisonMethod(roomDeskPhone, roomDeskPhone2);
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
    }
}