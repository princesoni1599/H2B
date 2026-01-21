package com.example.h2b.repository;

import com.example.h2b.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// @Repository annotation is optional because JpaRepository already includes it
@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    // You can define custom queries if needed
    Optional<Users> findById(Integer id);

    List<Users> findByRole(String role);

}
