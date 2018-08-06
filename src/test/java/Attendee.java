public class Attendee {
    final Laptop laptop;
    final Mobile mobile;

    public Attendee(Laptop laptop, Mobile mobile) {
        this.laptop = laptop;
        this.mobile = mobile;
    }

    public Inventory[] inventory() {
        return new Inventory[0];
    }
}
