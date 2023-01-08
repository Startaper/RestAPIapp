package com.example.RestAPIapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SettingController {

    @GetMapping("/settings")
    public String view() {
        return "settings";
    }

}
