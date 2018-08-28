package com.automation_boss.inventory;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class CellPhone implements Phone {
    protected String mobilePhone;
    protected int callReduce = 2;
    protected long battery = TimeUnit.HOURS.toMillis(1);
    protected int callsCount;
    protected boolean isMP3;
    protected int weight;
    protected boolean isWaterProof;
    long objectCreationDate;

    public CellPhone(String mobilePhone, boolean isMP3, int weight, boolean isWaterProof) {
        this.mobilePhone = mobilePhone;
        this.isMP3 = isMP3;
        this.weight = weight;
        this.isWaterProof = isWaterProof;
        this.objectCreationDate = System.currentTimeMillis();
    }

    public void call(String number) {
        System.out.println("Dialing from cellPhone - " + number);
        callsCount++;
    }

    public void contactsList() throws IOException {
        System.out.println("qwe");
    }

    public void print(PrintStream out) {
        out.println("mobile - " + mobilePhone);
    }

    public long batteryPercentage() {
        return ((100 * ((battery - (System.currentTimeMillis() - objectCreationDate)))) / battery) - (callsCount
                * callReduce);
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
