package com.example.RestAPIapp.controller;

import com.example.RestAPIapp.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new UserEntity());
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }

    @PostMapping("/login")
    public String auth(Model model) {
        UserEntity user = (UserEntity) model.getAttribute("user");
        System.out.println("Username: " + user.getUsername() + ", password: " + user.getPassword());
        return "redirect:/home";
    }

}
