package com.firstproyect.firstproyect.service;

import java.util.List;

import com.firstproyect.firstproyect.model.User;

public interface UserService {
    List <User> getAll();

    void add(User user);

    void remove (User user);

    int size();

    User getUser(int position);
}
