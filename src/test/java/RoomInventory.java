public class RoomInventory {
    public static void main(String args[]){
        Table roomTable = new Table("green", 15);
        Chair roomChair = new Chair("red", 3, "bubble");
        Chair roomChair2 = new Chair("yellow", 13, "rectangle");
        Phone roomPhone = new Phone("380990288777");
        roomTable.print();
        roomChair.print();
        roomChair2.print();
        roomPhone.batteryStatus(false);
        roomPhone.call();
    }



}
