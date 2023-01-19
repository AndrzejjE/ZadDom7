package com.example.zaddom7;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Storage {
    private Regist regist1 = new Regist(1, "W trakcie", "user1", "emp1");
    private Regist regist2 = new Regist(2, "Zamkniete", "user2", "emp2");

    private List<Regist> regists = new ArrayList<>();

    public Storage() {
        regists.add(regist1);
        regists.add(regist2);
    }

    public List<Regist> getRegists() {
        return regists;
    }

    public Regist findByID(int ID) {
        for (Regist regist : regists) {
            if (regist.getID() == ID) {
                return regist;
            }
        }
        return null;
    }

    public Regist addRegist(Regist regist) {
        regists.add(regist);
        return regist;
    }

    public void changeStatus(int ID, String newStatus) {
        Regist regist = findByID(ID);
        if (regist != null) {
            regist.setStatus(newStatus);
        }
    }

    public void changeEmp(int ID, String newEmp) {
        Regist regist = findByID(ID);
        if (regist != null) {
            regist.setEmployee(newEmp);
        }
    }



}
