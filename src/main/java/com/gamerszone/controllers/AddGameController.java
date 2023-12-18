// src/main/java/com/gamerszone/controllers/AddGameController.java

package com.gamerszone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddGameController {

    @GetMapping("/addGame")
    public String showAddGameForm() {
        return "addGameForm";
    }
}
