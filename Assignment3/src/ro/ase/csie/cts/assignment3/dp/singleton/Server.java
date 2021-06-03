package ro.ase.csie.cts.assignment3.dp.singleton;

import ro.ase.csie.cts.assignment3.ServerInterface;

public class Server implements ServerInterface {

	String ipAddress;
	int port;
	int maxConnections;

	static int noConnections = 0;
	private static Server uniqueServer = null;

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

	private Server(String ipAddress, int port, int maxConnections) throws Exception {
		if (uniqueServer != null)
			throw new Exception("Server already created!");
		else if(uniqueServer == null) {
			this.ipAddress = ipAddress;
			this.port = port;
			this.maxConnections = maxConnections;
		}
	}

	public synchronized static Server getServer() throws Exception {
		if(uniqueServer == null) {
			uniqueServer = new Server("65.217.150.138", 25565, 3);
		}
		
		return uniqueServer;
	}
	
}
