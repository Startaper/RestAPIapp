package com.example.RestAPIapp.controller;

import com.example.RestAPIapp.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }

    @PostMapping("/login")
    public String auth(Model model) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(String.valueOf(model.getAttribute("username")));
        userEntity.setPassword(String.valueOf(model.getAttribute("password")));
        System.out.println("Username: " + userEntity.getUsername() + "\nPassword: " + userEntity.getPassword());
        return "redirect:/home";
    }

}
