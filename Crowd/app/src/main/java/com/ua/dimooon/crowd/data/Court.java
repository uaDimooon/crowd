package com.ua.dimooon.crowd.data;

import java.util.List;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Courts")
public class Court extends Model {
	@Column(name = "Name")
	public String name;

	public List<Game> games() {
		return getMany(Game.class, "Court");
	}

	@Column(name = "Event",
			onUpdate = Column.ForeignKeyAction.CASCADE, onDelete = Column.ForeignKeyAction.CASCADE)
	public Event currentEvent;
}
