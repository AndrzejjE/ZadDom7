package com.example.zaddom7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZadDom7Application {
   /* private RegistController registController;
    private Storage storage;
    public ZadDom7Application(RegistController registController, Storage storage) {
        this.registController = registController;
        this.storage = storage;
        storage.addRegist(new Regist(3,"Zamknięte","usr3","emp3"));
        storage.changeStatus(1,"Otwarte");
        storage.changeEmp(1,"emp123123");
        System.out.println(storage.findByID(1));
        //System.out.println(registController.getAllRegists());
        System.out.println(storage.getRegists());
    }*/
    public static void main(String[] args) {
        SpringApplication.run(ZadDom7Application.class, args);
    }

}
