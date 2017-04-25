package com.ua.dimooon.crowd.data.dao;

import com.ua.dimooon.crowd.data.Court;

public class CourtHelper {
	public static Court create(final String name) {
		final Court court = new Court();
		court.name = name;
		court.save();
		return court;
	}

	public static void delete(final Court court) {
		court.delete();
	}
}
