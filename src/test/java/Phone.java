public class Phone {
    String phoneType;

    public Phone(String phoneType) {
        this.phoneType = phoneType;
    }

    public void call(String number) {
        System.out.println("Dialing - " + number);
    }

    public boolean batteryStatus(boolean res) {
        if (res) {
            System.out.println("Battery is full");
        } else {
            System.out.println("Low battery");
        }
        return res;
    }

    public void print(){
        System.out.println("You have chosen " + phoneType + " phone");
    }
}
