package com.ua.dimooon.crowd.data;

import java.util.List;

import com.activeandroid.Model;
import com.activeandroid.annotation.Table;

@Table(name = "Events")
public class Event extends Model {
	public long date;
	public String name;

	public List<Court> courts() {
		return getMany(Court.class, "Event");
	}
}
