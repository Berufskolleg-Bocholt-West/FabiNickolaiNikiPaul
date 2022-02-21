package de.bkbw.model;

import java.util.UUID;

public class Device {

	public final UUID uuid;
	public String model;
	public String ip;
	public String mc;
	
	public Device(UUID uuid, String model, String ip, String mc) {
		this.uuid = uuid;
		this.model = model;
		this.ip = ip;
		this.mc = mc;
	}
	
	public UUID getUUID() {
		return this.uuid;
	}
}
