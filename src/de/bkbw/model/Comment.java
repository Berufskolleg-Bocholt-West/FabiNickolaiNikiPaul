package de.bkbw.model;

import java.util.UUID;

public class Comment {

	private final UUID uuid;
	public String user;
	public String creationDate;
	
	public Comment(UUID uuid, String user, String creationDate) {
		this.uuid = uuid;
		this.user = user;
		this.creationDate = creationDate;
	}
	
	public UUID getUUID() {
		return this.uuid;
	}
}
