package com.automation_boss.inventory;

import java.io.IOException;

public interface Phone extends Inventory {
    void call(String number);

    void contactsList() throws IOException;
}
