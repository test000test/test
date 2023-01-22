package com.example.registrationform.controller;

import com.example.registrationform.entity.User;
import com.example.registrationform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
    private final UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginForm(@RequestParam String username,
                            @RequestParam String password,
                            User user) {
        userService.loadUserByUsername(username);
        return "redirect:login";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/registrationPage")
    public String registrationPage() {
        return "registrationPage";
    }

    @PostMapping("/registrationForm")
    public String registrationForm(@RequestParam String username,
                                   @RequestParam String password,
                                   User user,
                                   Model model) {
        userService.registrationUser(user);
        return "redirect:login";
    }
}
