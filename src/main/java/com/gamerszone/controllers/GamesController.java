// src/main/java/com/gamerszone/controllers/GamesController.java

package com.gamerszone.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GamesController {

    @GetMapping("/games")
    public String showAllGames(Model model) {
        // Logic to fetch all games from the database or service
        // For simplicity, let's create a sample list of games
        List<String> games = Arrays.asList("Game A", "Game B", "Game C");

        // Add the list of games to the model
        model.addAttribute("games", games);

        // Return the view name
        return "allGames";
    }
}
