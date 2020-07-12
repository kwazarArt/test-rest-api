package com.kwazart.application;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class User {
    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
