public class Phone {
    String number;

    public Phone(String number) {
        this.number = number;
    }

    public void call() {
        System.out.println("Dialing - " + number);
    }

    public boolean batteryStatus(boolean res) {
        if (res == true) {
            System.out.println("Battery is full");
        } else {
            System.out.println("Low battery");
        }
        return res;
    }
}
