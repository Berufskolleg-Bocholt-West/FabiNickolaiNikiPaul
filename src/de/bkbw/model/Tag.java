package de.bkbw.model;

import java.util.ArrayList;
import java.util.UUID;

public class Tag {
	
	public final UUID uuid;
	public String name;
	public ArrayList<Ticket> tickets;
	
	public Tag(UUID uuid, String name, ArrayList<Ticket> tickets) {
		this.uuid = uuid;
		this.name = name;
		this.tickets = tickets;
	}
	
	public UUID getUUID() {
		return this.uuid;
	}
}
