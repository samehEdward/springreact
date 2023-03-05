package com.springreact.springreact.model;

import java.net.URISyntaxException;
import java.util.Collection;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {
    private ContactRepo contactRepo;

    public ContactController(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    @GetMapping("/contacts")
    Collection<Contact> contacts() {
        return (Collection<Contact>) contactRepo.findAll();
    }

    @PostMapping("/contacts")
    ResponseEntity<Contact> createContact(@Validated @RequestBody Contact contact) throws URISyntaxException {
        Contact result = contactRepo.save(contact);
        return ResponseEntity.ok().body(result);
    }
}
