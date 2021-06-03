package ro.ase.csie.cts.assignment3.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.assignment3.dp.builder.Server;

public class TestBuilder {

	static Server server = null;
	static String ipAddress = "94.206.250.96";
	static int maxConnections = 16;

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
	public void testBuilderMinSpecification() {
		server = new Server.ServerBuilder(ipAddress, maxConnections).build();

		assertEquals("Ip Address not set correctly", ipAddress, server.getIpAddress());
		assertEquals("Max Connections not set correctly", maxConnections, server.getMaxConnections());
	}

	@Test
	public void testBuilderWhiteList() {
		server = new Server.ServerBuilder(ipAddress, maxConnections).hasWhiteList().build();

		assertEquals("WhiteList not set correctly", true, server.getHasWhiteList());
	}

}
