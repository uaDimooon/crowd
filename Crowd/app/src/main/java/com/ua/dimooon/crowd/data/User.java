package com.ua.dimooon.crowd.data;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Users")
public class User extends Model {
	@Column(name = "Name")
	public String name;

	@Column(name = "Game",
			onUpdate = Column.ForeignKeyAction.CASCADE, onDelete = Column.ForeignKeyAction.CASCADE)
	public Game currentGame;
}
