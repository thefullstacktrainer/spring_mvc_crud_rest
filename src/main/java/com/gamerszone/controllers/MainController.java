// src/main/java/com/gamerszone/controllers/MainController.java

package com.gamerszone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String main() {
        return "gamerszone";
    }
}
