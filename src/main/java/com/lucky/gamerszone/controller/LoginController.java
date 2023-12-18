package com.lucky.gamerszone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String showLoginForm() {
        return "loginform";
    }

    @PostMapping
    public String performLogin(Model model, String username, String password) {
        // Simple authentication logic (for demonstration purposes)
        if ("user".equals(username) && "password".equals(password)) {
            model.addAttribute("username", username);
            return "loginresult";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "loginform";
        }
    }
}
