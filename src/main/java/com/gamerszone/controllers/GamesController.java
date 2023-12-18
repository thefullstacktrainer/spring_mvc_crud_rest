package com.gamerszone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.gamerszone.models.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/games")
public class GamesController {

    private static List<Game> games = new ArrayList<>();

    static {
        // Initialize with some sample games
        games.add(new Game(1L, "Game A", "Action", Arrays.asList("PC", "PlayStation"), true));
        games.add(new Game(2L, "Game B", "Adventure", Arrays.asList("Xbox", "Nintendo"), false));
        games.add(new Game(3L, "Game C", "Strategy", Arrays.asList("PC"), true));
    }

    @GetMapping("/addGame")
    public String showAddGameForm(Model model) {
        model.addAttribute("newGame", new Game());
        return "addGameForm";
    }

    @GetMapping
    public String showAllGames(Model model) {
        model.addAttribute("games", games);
        return "allGames";
    }

    @PostMapping("/saveGame")
    public String saveGame(@ModelAttribute("newGame") Game newGame) {
        long newId = games.size() + 1;
        newGame.setId(newId);
        games.add(newGame);
        return "redirect:/games";
    }

    @GetMapping("/{id}")
    public String showGameDetails(@PathVariable Long id, Model model) {
        Game selectedGame = findGameById(id);
        if (selectedGame != null) {
            model.addAttribute("game", selectedGame);
            return "gameDetails";
        } else {
            return "redirect:/games";
        }
    }

    private Game findGameById(Long id) {
        return games.stream()
                .filter(game -> game.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
