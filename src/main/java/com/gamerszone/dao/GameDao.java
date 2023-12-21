package com.gamerszone.dao;

import com.gamerszone.models.Game;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class GameDao {

	private JdbcTemplate jdbcTemplate;

	private ObjectMapper objectMapper;

	public GameDao(JdbcTemplate jdbcTemplate, ObjectMapper objectMapper) {
		this.jdbcTemplate = jdbcTemplate;
		this.objectMapper = objectMapper;
	}

	public int save(Game game) {
		String sql = "INSERT INTO games (name, genre, platforms, multiplayer) VALUES (?, ?, ?, ?)";

		try {
			// Convert platforms list to a valid JSON string
			String platformsJson = objectMapper.writeValueAsString(game.getPlatforms());

			return jdbcTemplate.update(sql, game.getName(), game.getGenre(), platformsJson, game.isMultiplayer());
		} catch (JsonProcessingException e) {
			throw new RuntimeException("Error converting platforms to JSON", e);
		}
	}

	public int update(Game game) {
		String sql = "UPDATE games SET name=?, genre=?, platforms=?, multiplayer=? WHERE id=?";
		return jdbcTemplate.update(sql, game.getName(), game.getGenre(), serializePlatforms(game.getPlatforms()),
				game.isMultiplayer(), game.getId());
	}

	public int delete(Long id) {
		String sql = "DELETE FROM games WHERE id=?";
		return jdbcTemplate.update(sql, id);
	}

	// Helper method to serialize the list of platforms to a JSON string
	private String serializePlatforms(List<String> platforms) {
		try {
			return objectMapper.writeValueAsString(platforms);
		} catch (JsonProcessingException e) {
			throw new RuntimeException("Error serializing platforms to JSON", e);
		}
	}

	public Game getGameById(Long id) {
		String sql = "SELECT * FROM games WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, (rs, rowNum) -> {
			Game game = new Game();
			game.setId(rs.getLong("id"));
			game.setName(rs.getString("name"));
			game.setGenre(rs.getString("genre"));
			game.setMultiplayer(rs.getBoolean("multiplayer"));

			// Platforms is stored as a comma-separated string in the database
			String platformsString = rs.getString("platforms");
			List<String> platforms = Arrays.asList(platformsString.split(","));
			game.setPlatforms(platforms);

			return game;
		});
	}

	public List<Game> getAllGames() {
		String sql = "SELECT * FROM games";

		return jdbcTemplate.query(sql, new RowMapper<Game>() {
			@Override
			public Game mapRow(ResultSet rs, int rowNum) throws SQLException {
				Game game = new Game();
				game.setId(rs.getLong("id"));
				game.setName(rs.getString("name"));
				game.setGenre(rs.getString("genre"));
				game.setMultiplayer(rs.getBoolean("multiplayer"));

				// Platforms is stored as a comma-separated string in the database
				String platformsString = rs.getString("platforms");
				List<String> platforms = Arrays.asList(platformsString.split(","));
				game.setPlatforms(platforms);

				return game;
			}
		});
	}
}
