import java.io.PrintStream;

import static java.lang.System.out;

public class RoomInventory {
    public printCreature(PrintStream out, Creature creature){

    }

    public static void main(String args[]){
        Table roomTable = new Table("green", 15);
        Chair roomChair = new Chair("red", 3, "bubble");
        Chair roomChair2 = new Chair("yellow", 13, "rectangle");
        Phone roomPhone = new Phone("mobile");
        roomPhone.batteryStatus(false);
        roomPhone.call("380990288777");
        roomPhone.call("380674737213");


    }
}
