package com.ua.dimooon.crowd.data;

import java.util.Date;

import com.activeandroid.Model;

public class Printer extends Model {
	public static String user(final User user) {
		return "user.id = " + user.getId() +
				" user.name = " + user.name +
				" user.game = " + user.currentGame;
	}

	public static String game(final Game game) {
		final StringBuilder builder = new StringBuilder("game: [ id " + game.getId());
		builder.append(", " + game.currentCourt);
		for (final User user : game.users()) {
			builder.append("\n");
			builder.append(Printer.user(user));
		}
		builder.append("]");
		return builder.toString();
	}

	public static String court(final Court court) {
		final StringBuilder builder = new StringBuilder("court: [ id " + court.getId());
		builder.append(", " + court.name);
		for (final Game game : court.games()) {
			builder.append("\n");
			builder.append(Printer.game(game));
		}
		builder.append("]");
		return builder.toString();
	}

	public static String event(final Event event) {
		final StringBuilder builder = new StringBuilder("event: [ id " + event.getId());
		builder.append(", " + event.name);
		builder.append(", " + new Date(event.date).toString());
		for (final Court court : event.courts()) {
			builder.append("\n");
			builder.append(Printer.court(court));
		}
		builder.append("]");
		return builder.toString();
	}
}
