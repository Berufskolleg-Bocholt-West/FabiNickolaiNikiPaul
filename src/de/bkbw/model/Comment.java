package de.bkbw.model;

import java.util.UUID;

public class Comment {

	private final UUID uuid;
	public final String user;
	public final String creationDate;
	public final String mc;
	
	public Comment(UUID uuid, String user, String creationDate, String mc) {
		this.uuid = uuid;
		this.user = user;
		this.creationDate = creationDate;
		this.mc = mc;
	}
	
	public UUID getUUID() {
		return this.uuid;
	}
}
