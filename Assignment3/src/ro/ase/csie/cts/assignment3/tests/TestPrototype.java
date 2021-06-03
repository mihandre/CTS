package ro.ase.csie.cts.assignment3.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.assignment3.dp.prototype.MinecraftServer;

public class TestPrototype {

	static MinecraftServer serverPrototype = null;
	static int maxConnections = 16;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		serverPrototype = new MinecraftServer("Minecraft", maxConnections);
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
	public void testClonesDifferentReferences() {
		MinecraftServer serverClone = (MinecraftServer) serverPrototype.clone();

		if (serverClone.hashCode() == serverPrototype.hashCode())
			fail("Shallow copy");

		else
			assertTrue(true);
	}

	@Test
	public void testCopyingServerAttributes() {
		MinecraftServer serverClone = (MinecraftServer) serverPrototype.clone();

		boolean cloneAttributesOK = true;

		if (serverClone.getIpAddress() != serverPrototype.getIpAddress())
			cloneAttributesOK = false;
		if (serverClone.getMaxConnections() != serverPrototype.getMaxConnections())
			cloneAttributesOK = false;
		if (serverClone.getPort() != serverPrototype.getPort())
			cloneAttributesOK = false;
		if (serverClone.serverType != serverPrototype.serverType)
			cloneAttributesOK = false;
		if (serverClone.noConnections != serverPrototype.noConnections)
			cloneAttributesOK = false;

		assertTrue("Clone attributes did not match those of prototype", cloneAttributesOK);

	}

}
