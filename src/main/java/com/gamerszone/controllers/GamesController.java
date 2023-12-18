// src/main/java/com/gamerszone/controllers/GamesController.java

package com.gamerszone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class GamesController {

    @GetMapping("/addGame")
    public String showAddGameForm() {
        return "addGameForm";
    }

    @GetMapping("/games")
    public String showAllGames(@RequestParam(required = false) String category, Model model) {
        // Logic to fetch games based on category (if provided)
        // For simplicity, let's create a sample list of games
        List<String> games;
        if ("action".equalsIgnoreCase(category)) {
            games = Arrays.asList("Game A (Action)", "Game B (Action)", "Game C (Action)");
        } else {
            games = Arrays.asList("Game A", "Game B", "Game C");
        }

        // Add the list of games to the model
        model.addAttribute("games", games);

        // Return the view name
        return "allGames";
    }

    @PostMapping("/saveGame")
    public String saveGame(@RequestParam String gameName) {
        // Logic to save the game to the database or service
        // For simplicity, let's print the game name for now
        System.out.println("Saving Game: " + gameName);

        // Redirect to the /games endpoint to show the updated list of games
        return "redirect:/games";
    }
}
