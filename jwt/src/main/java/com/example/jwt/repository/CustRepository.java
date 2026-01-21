package com.example.jwt.repository;

import com.example.jwt.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustRepository extends JpaRepository<Customer,String> {
    Customer findByUserId(String userId);
}
