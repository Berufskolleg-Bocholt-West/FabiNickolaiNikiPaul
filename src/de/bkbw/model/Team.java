package de.bkbw.model;

import java.util.ArrayList;
import java.util.UUID;

public class Team {
	
	public final UUID uuid;
	public String name;
	public ArrayList<User> members;
	
	public Team(UUID uuid, String name, ArrayList<User> members) {
		this.uuid = uuid;
		this.name = name;
		this.members = members;
	}
	
	public UUID getUUID() {
		return this.uuid;
	}
}
