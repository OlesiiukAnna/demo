package com.example.demo;

import java.util.List;

public interface UserService {

    User findById(String id);

    void create(User user);

}
