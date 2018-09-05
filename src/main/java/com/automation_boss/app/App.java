package com.automation_boss.app;

import com.automation_boss.area.Room;
import com.automation_boss.attendies.Attendee;
import com.automation_boss.inventory.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class App {
    public static void main(String args[]) {
        Chair roomChair = new Chair("red", 3, "bubble");
        Chair roomChair2 = new Chair("yellow", 13, "rectangle");
        Laptop laptop1 = new Laptop("LAPTOP1", 12, true, 200, "yellow", 13, 2, true);
        Laptop laptop2 = new Laptop("LAPTOP1", 12, true, 200, "yellow", 13, 2, true);
        CellPhone mobile1 = new CellPhone("MOB1", true, 100, false);
        CellPhone mobile2 = new CellPhone("MOB1", false, 100, false);
        NoteBook firstNotebook = new NoteBook("Tetradka", 60, "yellow", "paper");
        NoteBook secondNotebook = new NoteBook("KrutaiaTetradka", 60, "yellow", "paper");
        PaperSheets firstSheetsSet = new PaperSheets(5, 50);
        DeskPhone roomDeskPhone = new DeskPhone("mobile", 23, "blac1k");
        DeskPhone roomDeskPhone2 = new DeskPhone("mobile", 23, "black");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Impossible to wait for 10 seconds");
        }
        roomDeskPhone.call("380990288777");
        roomDeskPhone.call("380674737213");
        roomDeskPhone.call("123123123");
        App cM = new App();
        cM.inventoryComparing(roomDeskPhone, roomDeskPhone2);
        cM.inventoryComparing(firstNotebook, secondNotebook);
        cM.inventoryComparing(mobile1, mobile2);
        cM.inventoryComparing(mobile1, roomChair);
        try {
            roomDeskPhone.contactsList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        PrintStream myFile;
        try {
            myFile = new PrintStream(new FileOutputStream("test.txt", false));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Attendee firstAttendee = new Attendee(mobile1, laptop1, firstNotebook);
        Attendee secondAttendee = new Attendee(laptop2, mobile2, firstSheetsSet);

        Room r1 = new Room(
                new Table("green", 15),
                new Chair[] { roomChair, roomChair2 },
                roomDeskPhone
        );
        r1.join(firstAttendee);
        r1.join(secondAttendee);
        r1.describeInventory(myFile);
        mobile1.call("8888888888");
        mobile1.call("777777");
        mobile1.call("6666666666");
        mobile1.call("555555555");
        mobile1.call("44444444");
        mobile1.call("3333333333");
    }

    public void inventoryComparing(Inventory firstElement, Inventory secondElement) {
        System.out.println(firstElement.equals(secondElement) + " - " + firstElement + " - " + secondElement);
    }
}
