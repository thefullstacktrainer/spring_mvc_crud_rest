package com.lucky.gamerszone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GamersController {

	@RequestMapping("/games")
	public String displayGames() {
		return "games";
	}

	@RequestMapping("/game")
	public String displayGame() {
		return "game";
	}
	

	@RequestMapping("/gamedashboard")
	public String showDashboard() {
		return "gamedashboard";
	}
	
	
}
