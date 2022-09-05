package com.example.classregistryapp.repository;

import com.example.classregistryapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository <User,Long> {
    Optional<User> findUserBy(String username);
}
