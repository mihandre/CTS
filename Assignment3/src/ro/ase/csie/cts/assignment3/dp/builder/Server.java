package ro.ase.csie.cts.assignment3.dp.builder;

import ro.ase.csie.cts.assignment3.ServerInterface;

public class Server implements ServerInterface {

	String ipAddress;
	int port;
	int maxConnections;
	int noConnections=0;
	
	String host;
	boolean hasWhiteList=false;
	
	private Server() {
	}
	
	public static class ServerBuilder {
		
		private Server server = null;
		
		public ServerBuilder(String ip, int maxConnections) {
			server = new Server();
			server.ipAddress = ip;
			server.maxConnections = maxConnections;
		}
		
		public ServerBuilder hasWhiteList() {
			server.hasWhiteList = true;
			return this;
		}
		
		public ServerBuilder specifyHost(String host) {
			server.host=host;
			return this;
		}
		
		public ServerBuilder specifyPort(int port) {
			server.port=port;
			return this;
		}
		
		public Server build() {
			return this.server;
		}
	}
	
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
	
	public boolean getHasWhiteList() {
		return this.hasWhiteList;
	}

}
