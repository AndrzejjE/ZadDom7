package com.example.zaddom7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {

    private Storage storage;


    @DisplayName("Testowanie utworzenia nowego zgłoszenia")
    @Test
    public void testCreateNewRegist() {
        // Arrange
        Storage storage = new Storage();
        int initialSize = storage.getRegists().size();

        // Act
        Regist newRegist = storage.addRegist(new Regist(2, "Otwarte", "user3", "emp3"));

        // Assert
        //assertNull(newRegist);
        assertNotEquals(initialSize, storage.getRegists().size());
    }

    @DisplayName("Testowanie zmiany statusu")
    @Test
    void Test2() {
        Storage storage = new Storage();
        Regist regist = storage.findByID(1);
        String fstatus = regist.getStatus();

        storage.changeStatus(1,"Zamknięte");
        regist = storage.findByID(1);
        String changeStatus = regist.getStatus();

        assertNotEquals(fstatus,changeStatus);
    }


}