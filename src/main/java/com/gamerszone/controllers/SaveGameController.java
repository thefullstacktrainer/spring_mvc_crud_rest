// src/main/java/com/gamerszone/controllers/SaveGameController.java

package com.gamerszone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaveGameController {

    @PostMapping("/saveGame")
    public String saveGame(@RequestParam String gameName) {
        // Logic to save the game to the database or service
        // For simplicity, let's print the game name for now
        System.out.println("Saving Game: " + gameName);

        // Redirect to the /games endpoint to show the updated list of games
        return "redirect:/games";
    }
}
