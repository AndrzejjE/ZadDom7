package com.example.zaddom7;

import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class StorageTestyIntegracyjne {

    @MockBean
    private Storage storage;


    @Test
    void testAllRegist() {
        List<Regist> allRegist = new ArrayList<>();
        allRegist.add(new Regist(1,"W trakcie","usr1","emp1"));
        allRegist.add(new Regist(2,"Zamknięte","usr2","emp2"));
        allRegist.add(new Regist(3,"Otwarte","usr3","emp3"));

        when(storage.getRegists()).thenReturn(allRegist);

        List<Regist> result = storage.getRegists();
        assertEquals(allRegist,result);
    }

    @Test
    void testFindByID() {
        Regist expRegist = new Regist(22,"Zamknięte","user22","emp2");

        when(storage.findByID(22)).thenReturn(expRegist);

        Regist result = storage.findByID(22);

        assertEquals(expRegist,result);
        assertEquals("user22",result.getUser());
    }

    @Test
    public void testChangeEmp() {
        Storage storage = new Storage();
        Regist regist = storage.findByID(1);

        String initialEmp = regist.getEmployee();

        storage.changeEmp(1, "emp4");
        regist = storage.findByID(1);
        String updatedEmp = regist.getEmployee();

        assertNotEquals(initialEmp, updatedEmp);
        assertEquals("emp4", updatedEmp);
    }


}