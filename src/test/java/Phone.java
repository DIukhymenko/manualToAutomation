import java.io.PrintStream;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Phone implements Creature{
    String phoneType;
    long battery = TimeUnit.HOURS.toMillis(1);
    int callsCount;
    double callReduce = (battery*2)/100; //2% from 1 hour

    long currDate = System.currentTimeMillis();
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
        long batteryPercentage = (long) ((100*((battery - (currDate - objectCreationDate) - (callsCount * callReduce))))/battery);
        return batteryPercentage;
    }

    public void print(PrintStream out){
        out.println("You have chosen " + phoneType + " phone");
    }
}
