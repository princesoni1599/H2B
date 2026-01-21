package com.example.jwt.controller;

import com.example.jwt.model.Customer;
import com.example.jwt.repository.CustRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1")
public class CustController {

    @Autowired
    private CustRepository custRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @PostMapping("/signup")
    public String createuser(@RequestBody Customer cust)
    {
        if(custRepository.findByUserId(cust.getUserId())!=null)
        {
            return "already present in the database";
        }
        cust.setPassword(passwordEncoder.encode(cust.getPassword()));
        custRepository.save(cust);
        return "updated";
    }

    @GetMapping("/{id}")
    public Customer getuser(@PathVariable String id)
    {
        return custRepository.findByUserId(id);
    }

}
