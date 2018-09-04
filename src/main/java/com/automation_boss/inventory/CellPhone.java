package com.automation_boss.inventory;

import java.io.PrintStream;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class CellPhone implements Phone {
    private final String mobilePhone;
    private final int callReduce = 24;
    private final long battery = TimeUnit.HOURS.toMillis(1);
    private int callsCount;
    private final boolean isMP3;
    private final int weight;
    private final boolean isWaterProof;
    private final long objectCreationDate;

    public CellPhone(String mobilePhone, boolean isMP3, int weight, boolean isWaterProof) {
        this.mobilePhone = mobilePhone;
        this.isMP3 = isMP3;
        this.weight = weight;
        this.isWaterProof = isWaterProof;
        this.objectCreationDate = System.currentTimeMillis();
    }

    public void call(String number) throws RuntimeException {
        if (batteryPercentage() <= 0) {
            throw new RuntimeException("Charge your phone");
        } else {
            System.out.println("Dialing from cellPhone - " + number);
            callsCount++;
        }
    }

    public long batteryPercentage() {
        return ((100 * ((battery - (System.currentTimeMillis() - objectCreationDate)))) / battery) - (callsCount
                * callReduce);
    }

    public void contactsList() {
        System.out.println("qwe");
    }

    public void print(PrintStream out) {
        out.println("mobile - " + mobilePhone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CellPhone cellPhone = (CellPhone) o;
        return isMP3 == cellPhone.isMP3 && weight == cellPhone.weight && isWaterProof == cellPhone.isWaterProof
                && Objects.equals(mobilePhone, cellPhone.mobilePhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilePhone, isMP3, weight, isWaterProof);
    }

    @Override
    public String toString() {
        return "CellPhone{" + "mobilePhone='" + mobilePhone + '\'' + ", isMP3=" + isMP3 + ", weight=" + weight
                + ", isWaterProof=" + isWaterProof + '}';
    }
}
