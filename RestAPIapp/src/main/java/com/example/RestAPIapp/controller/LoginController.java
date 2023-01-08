package com.example.RestAPIapp.controller;

import com.example.RestAPIapp.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }

    @PostMapping("/login")
    public String auth(Model model) {
        User user = (User) model.getAttribute("user");
        System.out.println("Username: " + user.getUsername() + ", password: " + user.getPassword());
        return "redirect:/home";
    }

}
