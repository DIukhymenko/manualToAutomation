import java.io.PrintStream;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Phone implements Creature{
    String phoneType;
    long battery = TimeUnit.HOURS.toMillis(24);
    int callsCount;
    long callReduce = TimeUnit.SECONDS.toMillis(100);

    Calendar rightNow = Calendar.getInstance();
    long offset = rightNow.get(Calendar.ZONE_OFFSET) +
            rightNow.get(Calendar.DST_OFFSET);
    long sinceMidnight = (rightNow.getTimeInMillis() + offset) %
            (24 * 60 * 60 * 1000);
    long batteryPercentage = (100*((battery - sinceMidnight - (callsCount * callReduce))))/battery;

    public Phone(String phoneType, int callsCount) {
        this.phoneType = phoneType;
        this.callsCount = callsCount;
    }

    public void call(String number) {
        System.out.println("Dialing - " + number);
    }

    public long batteryStatus() {
        if (batteryPercentage > 0) {
            System.out.println("battery is " + batteryPercentage + "%");
        } else {
            System.out.println("Bye Bye!");
        }
        return batteryPercentage;
    }

    public void print(PrintStream out){
        out.println("You have chosen " + phoneType + " phone");
    }
}
