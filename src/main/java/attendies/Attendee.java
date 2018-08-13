package attendies;

import inventory.Inventory;

public class Attendee {
    final Inventory[] attInv;

    public Attendee(Inventory... attInv) {
        this.attInv = attInv;
    }

    public Inventory[] inventory() {
        return attInv;
    }
}
