package com.example.RestAPIapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TasksController {

    @GetMapping("/tasks")
    public String view(Model model) {
        model.addAttribute("companyName", "ООО \"Истринская сыроварня\"");
        return "tasks";
    }

}
