package com.example.RestAPIapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorksheduleController {

    @GetMapping("/workshedule")
    public String view() {
        return "workshedule";
    }
}
