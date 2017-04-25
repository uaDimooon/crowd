package com.ua.dimooon.crowd.data.dao;

import java.util.List;

import com.ua.dimooon.crowd.data.Game;
import com.ua.dimooon.crowd.data.User;

public class GameHelper {
	public static Game create(final List<User> users) {
		final Game game = new Game();
		game.save();
		return game;
	}

	public static void delete(final Game game) {
		game.delete();
	}
}
