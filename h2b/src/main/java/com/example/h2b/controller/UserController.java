package com.example.h2b.controller;
import com.example.h2b.model.Users;
import com.example.h2b.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {


    @Autowired90FRT
    private UserService productService;

    @GetMapping("/")
    public String getRecipesByRating() {
        return productService.fetchAndSaveProducts();
    }

    @GetMapping("/users")
    public List<Users> getData()
    {
        return productService.getAllProducts();
    }

    @GetMapping("/role/{role}")
    public List<Users> getProductsByCategory(@PathVariable String role) {
        return productService.getUserByRole(role);
    }

    @GetMapping("/{id}")
    public Users getProductById(@PathVariable Integer id) {
        return productService.getUserById(id);
    }

    @GetMapping("/sortByAgeAsc")
    public List<Users> getAllProductsSortedByPriceAsc() {
        return productService.getAllProductsSortedByPriceAsc();
    }
}
