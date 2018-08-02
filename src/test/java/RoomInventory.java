import java.io.*;

public class RoomInventory {

    public void prCr(PrintStream out, Creature... creature){
        for (Creature creatures: creature){
            creatures.print(out);
        }
    }

    public static void main(String args[]) throws FileNotFoundException {
        Table roomTable = new Table("green", 15);
        Chair roomChair = new Chair("red", 3, "bubble");
        Chair roomChair2 = new Chair("yellow", 13, "rectangle");
//        Phone roomPhone = new Phone("mobile");
//        roomPhone.batteryStatus(false);
//        roomPhone.call("380990288777");
//        roomPhone.call("380674737213");
        PrintStream myFile = new PrintStream(new FileOutputStream("we.txt", false));
        RoomInventory rI = new RoomInventory();
        rI.prCr(myFile, roomTable, roomChair, roomChair2);
        rI.prCr(System.out, roomTable, roomChair, roomChair2);
    }

}
