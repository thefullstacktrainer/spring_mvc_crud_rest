package com.gamerszone.dao;

import com.gamerszone.models.Game;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class GameDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

//    public int save(Game game) {
//        // Implement the save logic here
//    }
//
//    public int update(Game game) {
//        // Implement the update logic here
//    }
//
//    public int delete(Long id) {
//        // Implement the delete logic here
//    }
//
//    public Game getGameById(Long id) {
//        // Implement the logic to get a game by ID
//    }

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
