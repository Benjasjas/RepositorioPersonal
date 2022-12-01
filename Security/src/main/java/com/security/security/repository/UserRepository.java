package com.security.security.repository;

import com.security.security.model.User;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long>{
    
    public Optional <User> findByUsername(String username);
}
