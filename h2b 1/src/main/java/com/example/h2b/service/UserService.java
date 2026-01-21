package com.example.h2b.service;
import com.example.h2b.model.UserResponse;
import com.example.h2b.model.Users;
import com.example.h2b.repository.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository productRepository;

    @Autowired
    private RestTemplate restTemplate;

    private static final String API_URL = "https://dummyjson.com/Users"; // External API URL

    @Autowired
    private EntityManager entityManager;
    // Method to call external API and store data
    @Transactional
    public String fetchAndSaveProducts() {
        // Fetching data from external API
        UserResponse userResponse = restTemplate.getForObject(API_URL, UserResponse.class);

        // Saving the fetched products into the H2 database
            if (userResponse.getUsers() != null) {
                List<Users> users = userResponse.getUsers();

                // Save the product to the database
                productRepository.saveAll(users);
        }
        return "Data Fetch from external API & stored succesfully to H2B Database";
    }

    public List<Users> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Users> getUserByRole(String role) {
        return productRepository.findByRole(role);
    }

    public Users getUserById(Integer id) {
        Optional<Users> product = productRepository.findById(id);
        return product.orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
    }

    public List<Users> getAllProductsSortedByPriceAsc() {
        return productRepository.findAll(Sort.by(Sort.Direction.ASC, "age"));
    }
}
