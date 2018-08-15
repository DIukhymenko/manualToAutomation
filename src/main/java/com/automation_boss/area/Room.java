package com.automation_boss.area;

import com.automation_boss.attendies.Attendee;
import com.automation_boss.inventory.Chair;
import com.automation_boss.inventory.DeskPhone;
import com.automation_boss.inventory.Inventory;
import com.automation_boss.inventory.Table;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Room {
    final Table table;
    final Chair[] chairs;
    final DeskPhone deskPhone;
    final List<Attendee> attendees;

    public Room(Table table, Chair[] chair, DeskPhone deskPhone) {
        this.table = table;
        this.chairs = chair;
        this.deskPhone = deskPhone;
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
        deskPhone.print(output);
        for (Attendee attendee: attendees){
            for (Inventory item: attendee.inventory()){
             item.print(output);
            }
        }
    }
}
