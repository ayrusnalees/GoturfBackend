package com.example.myproject.turf.Auth;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {
    @Autowired
    AuthService authService;
    
    @GetMapping("/users")
    public List<AuthEntity> getAllUsers() {
        return authService.shashAll();
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody AuthEntity authEntity) {
        authService.saveUser(authEntity);
        return "User registered successfully!";
    }

    // Other methods can be added here
}
