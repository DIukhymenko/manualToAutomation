package com.automation_boss.attendies;

import com.automation_boss.inventory.Inventory;

public class Attendee {
    final Inventory[] attInv;

    public Attendee(Inventory... attInv) {
        this.attInv = attInv;
    }

    public Inventory[] inventory() {
        return attInv;
    }
}
