package com.ua.dimooon.crowd.data;

import java.util.List;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Games")
public class Game extends Model {
	@Column(name = "Name")
	public String name;

	@Column(name = "Court",
			onUpdate = Column.ForeignKeyAction.CASCADE, onDelete = Column.ForeignKeyAction.CASCADE)
	public Court currentCourt;

	public List<User> users() {
		return getMany(User.class, "Game");
	}
}
