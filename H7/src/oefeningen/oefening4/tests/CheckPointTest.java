package oefeningen.oefening4.tests;

import oefeningen.oefening4.types.CheckPoint;
import oefeningen.oefening4.types.Item;
import oefeningen.oefening4.types.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckPointTest {

	private Player player;
	private CheckPoint checkPoint;

	@Before
	public void init() {
		checkPoint = new CheckPoint("Charlie", 120);
		player = new Player("Tester");
	}

	@Test
	public void checkPointControlReturnsFalseIfNotEnoughItemsCollected() {
		assertFalse(checkPoint.checkPointControl(player));
	}


	@Test
	public void checkPointControlReturnsTrueIfEnoughItemsCollected() {
		player.addItem(new Item("Item", 120));
		assertTrue(checkPoint.checkPointControl(player));
	}
}
