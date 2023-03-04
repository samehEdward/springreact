package com.springreact.springreact.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DemoLoader implements CommandLineRunner {

    private final ContactRepo repo;

    @Autowired
    public DemoLoader(ContactRepo repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repo.save(new Contact((long) 478, "Sam", "Sar", "sam@hitmail.com"));
    }

}
