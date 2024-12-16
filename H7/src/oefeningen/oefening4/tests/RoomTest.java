package oefeningen.oefening4.tests;

import oefeningen.oefening4.types.Direction;
import oefeningen.oefening4.types.Room;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RoomTest {

	private Room kitchen = new Room("Kitchen");
	private Room garage = new Room("Garage");
	private Room livingRoom = new Room("Living Room");

	@Test
	public void getInstructionsTest() {
		kitchen.setDoor(Direction.EAST, garage);
		kitchen.setDoor(Direction.WEST, livingRoom);
		String instructions = kitchen.getInstructions();
		assertTrue(instructions.contains("EAST Garage"));
		assertTrue(instructions.contains("WEST Living Room"));
	}

	@Test
	public void getNameTest() {
		assertEquals("Living Room", livingRoom.getName());
	}

}
