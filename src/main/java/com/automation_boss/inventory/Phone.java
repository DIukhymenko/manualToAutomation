package com.automation_boss.inventory;

public interface Phone extends Inventory {
    void call(String number);

    void contactsList(String... contacts);
}
