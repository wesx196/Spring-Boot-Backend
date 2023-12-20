package com.wesxcodes.crudbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesxcodes.crudbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
