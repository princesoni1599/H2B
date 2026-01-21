package com.example.h2b.model;

import java.util.List;

public class UserResponse {
    private List<Users> users;

    // Getters and setters
    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "users=" + users +
                '}';
    }
}
