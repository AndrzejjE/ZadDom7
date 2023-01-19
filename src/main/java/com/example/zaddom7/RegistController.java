package com.example.zaddom7;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistController {
    private Storage storage;

    public RegistController(Storage storage) {
        this.storage = storage;
    }

    public List<Regist> getAllRegists() {
        return storage.getRegists();
    }

}
