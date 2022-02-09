package de.bkbw.model;

import java.util.ArrayList;
import java.util.UUID;

public class User {
	
	public final UUID uuid;
	public String email;
	public String username;
	public UserRole userRole;
	public ArrayList<Device> devices;
	
	public User(UUID uuid, String email, String username, UserRole userRole, ArrayList<Device> devices) {
		this.uuid = uuid;
		this.email = email;
		this.username = username;
		this.userRole = userRole; 
		this.devices = devices;
	}
	
	public UUID getUUID() {
		return this.uuid; 
	}
	
	
	
}
