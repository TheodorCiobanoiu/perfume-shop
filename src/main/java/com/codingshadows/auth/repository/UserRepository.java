package com.codingshadows.auth.repository;

import com.codingshadows.auth.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<MyUser, Integer> {
    MyUser findUserByUsername(String username);

    MyUser findUserByEmail(String email);
}