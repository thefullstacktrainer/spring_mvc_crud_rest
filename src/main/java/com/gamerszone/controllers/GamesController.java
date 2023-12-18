// src/main/java/com/gamerszone/controllers/GamesController.java

package com.gamerszone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gamerszone.models.Game;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/games") // Add @RequestMapping("/games") at the class level
public class GamesController {

	private static List<Game> games = new ArrayList<>();

	static {
		// Initialize with some sample games
		games.add(new Game(1L, "Game A"));
		games.add(new Game(2L, "Game B"));
		games.add(new Game(3L, "Game C"));
	}

	@GetMapping("/addGame")
	public String showAddGameForm(Model model) {
		model.addAttribute("newGame", new Game()); // Add an instance of Game to the model
		return "addGameForm";
	}

	@GetMapping
	public String showAllGames(Model model) {
		// Add the list of games to the model
		model.addAttribute("games", games);

		// Return the view name
		return "allGames";
	}

	@PostMapping("/saveGame")
	public String saveGame(@ModelAttribute("newGame") Game game, @RequestParam String name) {
		// Logic to save the game to the database or service
		// For simplicity, let's create a new game with an auto-incremented ID
		long newId = games.size() + 1;
		Game tempGame = new Game(newId, name);
		games.add(tempGame);

		// Redirect to the /games endpoint to show the updated list of games
		return "redirect:/games";
	}

	@GetMapping("/{id}")
	public String showGameDetails(@PathVariable Long id, Model model) {
		// Logic to fetch details of the game with the given ID
		Game selectedGame = findGameById(id);
		if (selectedGame != null) {
			// Add the selected game to the model
			model.addAttribute("game", selectedGame);
			return "gameDetails";
		} else {
			// Redirect to the /games endpoint if the game is not found
			return "redirect:/games";
		}
	}

	// Helper method to find a game by ID
	private Game findGameById(Long id) {
		return games.stream().filter(game -> game.getId().equals(id)).findFirst().orElse(null);
	}
}