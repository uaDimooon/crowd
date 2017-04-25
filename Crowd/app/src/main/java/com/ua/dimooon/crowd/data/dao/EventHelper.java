package com.ua.dimooon.crowd.data.dao;

import com.ua.dimooon.crowd.data.Event;

public class EventHelper {
	public static Event create(final String name, final long date) {
		final Event event = new Event();
		event.name = name;
		event.date = date;
		event.save();
		return event;
	}

	public static void delete(final Event event) {
		event.delete();
	}
}
