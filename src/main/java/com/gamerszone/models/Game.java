package com.gamerszone.models;

import java.util.List;

public class Game {
    private Long id;
    private String name;
    private String genre;
    private List<String> platforms;
    private boolean multiplayer;

    // Constructors

    public Game() {
        // Default constructor
    }

    public Game(Long id, String name, String genre, List<String> platforms, boolean multiplayer) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.platforms = platforms;
        this.multiplayer = multiplayer;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<String> platforms) {
        this.platforms = platforms;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    // toString method

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", platforms=" + platforms +
                ", multiplayer=" + multiplayer +
                '}';
    }
}
