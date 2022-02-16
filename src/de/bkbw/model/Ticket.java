package de.bkbw.model;

import java.util.ArrayList;
import java.util.UUID;

public class Ticket {
	
	public final UUID uuid;
	public String title;
	public String content;
	public User creator;
	public String creationDate;
	public User editor;
	public String timeToFinish;
	public ArrayList<Comment> comments;
	
	public Ticket(UUID uuid, String title, String content, User creator, String creationDate, User editor, String timeToFinish,  ArrayList<Comment> comments) {
		this.uuid = uuid;
		this.title = title;
		this.content = content;
		this.creator = creator;
		this.creationDate = creationDate;
		this.editor = editor;
		this.timeToFinish = timeToFinish;
		this.comments = comments;
		
	}
	
	public UUID getUUID() {
		return this.uuid;
	}
}
