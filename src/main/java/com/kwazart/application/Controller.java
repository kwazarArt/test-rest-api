package com.kwazart.application;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    private final UserRepository repository;

    public Controller(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    List<User> all() {
        return repository.findAll();
    }

    @GetMapping("/users/{id}")
    User one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

}
