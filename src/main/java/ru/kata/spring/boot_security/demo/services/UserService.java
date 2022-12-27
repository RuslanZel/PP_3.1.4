package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.Set;

public interface UserService {
    Set<User> allUsers();

    User findByName(String name);

    User findByEmail(String email);

    void addUser(User user);

    void updateUser(User user);

    User getUser(Long id);

    void deleteUser(Long id);
}
