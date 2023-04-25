package com.example.demo;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

import java.util.Optional;

public interface UserRepository extends CouchbaseRepository<User, String> {

    @Override
    <S extends User> S save(S entity);

    Optional<User> findById(String id);

}
