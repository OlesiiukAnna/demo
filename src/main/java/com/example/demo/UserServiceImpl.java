package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("PersonRepositoryService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(String id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void create(User user) {
        repository.save(user);
    }
}
