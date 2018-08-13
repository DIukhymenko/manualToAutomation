package inventory;

import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

public class Phone implements Inventory{
    String phoneType;
    long battery = TimeUnit.HOURS.toMillis(1);
    int callsCount;
    int callReduce = 2;
    long objectCreationDate;

    public Phone(String phoneType) {
        this.phoneType = phoneType;
        this.objectCreationDate = System.currentTimeMillis();
    }

    public void call(String number) {
        System.out.println("Dialing - " + number);
        callsCount++;
    }

    public long batteryPercentage() {
        return ((100*((battery - (System.currentTimeMillis() - objectCreationDate))))/battery)  - (callsCount * callReduce);
    }

    public void print(PrintStream out){
        out.println("You have chosen " + phoneType + " phone");
    }
}
