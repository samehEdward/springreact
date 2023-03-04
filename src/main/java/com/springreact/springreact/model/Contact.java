package com.springreact.springreact.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Contact {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String email;

    


    public Contact() {
    }


    public Contact(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    

    
}
