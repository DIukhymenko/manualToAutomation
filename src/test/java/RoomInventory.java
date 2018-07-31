public class RoomInventory {
    public static void main(String args[]){
        Table roomTable = new Table("green", 15);
        Chair roomChair = new Chair("red", 3, "bubble");
        Chair roomChair2 = new Chair("yellow", 13, "rectangle");
        Phone roomPhone = new Phone("mobile");
        roomTable.print();
        roomChair.print();
        roomChair2.print();
        roomPhone.batteryStatus(false);
        roomPhone.print();
        roomPhone.call("380990288777");
        roomPhone.call("380674737213");

    }
}
