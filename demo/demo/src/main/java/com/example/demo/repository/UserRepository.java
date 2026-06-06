package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users = Arrays.asList(
            new User(1,"admin","admin@gmail.com","ADMIN"),
            new User(2,"john","john@gmail.com","USER"),
            new User(3,"anna","anna@gmail.com","MANAGER")
    );

    public User findById(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
