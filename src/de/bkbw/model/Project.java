package de.bkbw.model;

import java.util.ArrayList;
import java.util.UUID;

public class Project {
	
	public final UUID uuid;
	public String name;
	public ArrayList<Tag> tags;
	
	public Project(UUID uuid, String name, ArrayList<Tag> tags) {
		this.uuid = uuid;
		this.name = name;
		this.tags = tags;
	}
	
	public UUID getUUID() {
		return this.uuid;
	}
}
