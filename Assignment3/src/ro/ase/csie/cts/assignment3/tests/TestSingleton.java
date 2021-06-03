package ro.ase.csie.cts.assignment3.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.assignment3.ServerInterface;
import ro.ase.csie.cts.assignment3.dp.singleton.Server;

public class TestSingleton {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testServerUniqueInstance() throws Exception {
		Server server1 = Server.getServer();
		Server server2 = Server.getServer();
		
		assertEquals("Instance is not unique", server1.hashCode(), server2.hashCode());
	}
	
	@Test
	public void testExceedMaxConnections() throws Exception {
		Server server = Server.getServer();
		
		for(int i = 0; i<server.getMaxConnections();i++)
			server.connect();
		
		assertEquals("Connections exceed max no. of allowed connections", false, server.connect());
	}

}
