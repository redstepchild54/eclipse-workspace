package treasureChest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreasureChestTest {

	@Test
	public void testAddGold() {
		TreasureChest x = new TreasureChest(1000);
		x.addGold(100);
		assertEquals(1100, x.getGold());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRemoveGold() {
		TreasureChest x = new TreasureChest(1000);
		x.removeGold(1050);
		x.getGold();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTreasureChestNegative() {
		TreasureChest z = new TreasureChest(-90);
	}

	@Test
	public void testTreasureChestZero() {
		TreasureChest x = new TreasureChest(0);
		assertEquals(0, x.getGold());
	}

//	@Test
//	public void testGetGold() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetGold() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testToString() {
//		fail("Not yet implemented");
//	}

}
