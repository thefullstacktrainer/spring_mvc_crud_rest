package com.lucky.gamerszone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/addgame")
public class AddGameController {

    @GetMapping
    public String showAddGameForm() {
        return "addgameform";
    }

    @PostMapping
    public String addGame(@RequestParam String name, @RequestParam String genre, Model model) {
        // Perform game addition logic here
        // You can use the 'name' and 'genre' parameters to process the form data

        // For simplicity, let's just display the added game details on the result page
        model.addAttribute("name", name);
        model.addAttribute("genre", genre);

        return "addgameresult";
    }
}
