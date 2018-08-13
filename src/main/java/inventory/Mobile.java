package inventory;

import java.io.PrintStream;

public class Mobile implements Inventory {
    protected String mobilePhone;

    public Mobile(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void print(PrintStream out) {
        out.println("mobile - " + mobilePhone);
    }
}
