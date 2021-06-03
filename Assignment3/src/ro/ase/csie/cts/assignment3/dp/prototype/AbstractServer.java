package ro.ase.csie.cts.assignment3.dp.prototype;

import java.util.ArrayList;

import ro.ase.csie.cts.assignment3.ServerInterface;

public abstract class AbstractServer implements Cloneable, ServerInterface{

	String ipAddress;
	int port;
	int maxConnections;
	public int noConnections=0;
	public String serverType;
	ArrayList<String> connectedUsers;
	
	@Override
	public String getIpAddress() {
		return this.ipAddress;
	}

	@Override
	public int getPort() {
		return this.port;
	}

	@Override
	public int getMaxConnections() {
		return this.maxConnections;
	}

	@Override
	public boolean connect() {
		if (noConnections < maxConnections) {
			noConnections++;
			return true;
		} else
			return false;

	}

	@Override
	public boolean disconnect() {
		if (noConnections > 0) {
			noConnections--;
			return true;
		} else
			return false;
	}
	
	public AbstractServer(String type, String ip, int port, int maxConnections) {
		System.out.println("Starting server hub...");
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.serverType = type;
		this.ipAddress = ip;
		this.port = port;
		this.maxConnections = maxConnections;
	}
	
	public AbstractServer() {
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
	
}
