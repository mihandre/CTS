package ro.ase.csie.cts.assignment3.dp.prototype;

import java.util.ArrayList;

import ro.ase.csie.cts.assignment3.ServerInterface;

public class MinecraftServer extends AbstractServer{

	public MinecraftServer(int maxConnections) {
		System.out.println("Starting Minecraft Server...");
		connectedUsers = new ArrayList<>(maxConnections);
		this.serverType = "Minecraft";
	}
	
	public MinecraftServer(String type, int maxConnections) {
		super(type,"47.24.216.172",25565,maxConnections);
		System.out.println("Starting Minecraft Server...");
		connectedUsers = new ArrayList<>(maxConnections);
		this.serverType = "Minecraft";
	}
	
	@Override
	public Object clone() {
		MinecraftServer clone = new MinecraftServer(this.maxConnections);
		clone.serverType = this.serverType;
		clone.ipAddress = this.ipAddress;
		clone.maxConnections = this.maxConnections;
		clone.connectedUsers = (ArrayList<String>) this.connectedUsers.clone();
		clone.port = this.port;
		return clone;
	}
	
}
