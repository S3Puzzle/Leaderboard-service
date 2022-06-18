package com.cas.leaderboard.controllers;

import com.cas.leaderboard.forms.Form;
import com.cas.leaderboard.entities.User;
import com.cas.leaderboard.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/leaderboard")
public class MainController {
    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody User addNewUser (@RequestBody Form form) {
        return userService.addNewUser(form);
    }
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }
}