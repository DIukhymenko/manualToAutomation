import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

public class Phone implements Creature{
    String phoneType;
    long battery = TimeUnit.HOURS.toMillis(24);
    int callsCount;
    long callReduce = TimeUnit.SECONDS.toMillis(100);
    long curTime = System.currentTimeMillis();
    long batteryPercentage = ((battery - curTime - (callsCount * callReduce)));


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
            //callsCount++;
        } else {
            System.out.println("Bye Bye!");
        }
        return batteryPercentage;
    }

    public void print(PrintStream out){
        out.println("You have chosen " + phoneType + " phone");
    }
}
