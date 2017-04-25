package com.ua.dimooon.crowd.data.dao;

import java.util.List;

import com.activeandroid.query.Select;
import com.ua.dimooon.crowd.data.User;

public class UserHelper {
	public static User create(final String name) {
		final User user = new User();
		user.name = name;
		user.save();
		return user;
	}

	public static void delete(final User user) {
		user.delete();
	}

	public static List<User> all() {
		return new Select().from(User.class).execute();
	}
}
