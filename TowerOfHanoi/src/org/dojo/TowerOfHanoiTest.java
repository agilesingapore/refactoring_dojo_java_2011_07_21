package org.dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TowerOfHanoiTest {
	private final int TOWER_1 = 1;
	private final int TOWER_2 = 2;
	private final int TOWER_3 = 3;
	
	private TowerOfHanoi towerOfHanoi = new TowerOfHanoi();

	@Test
	public void startsWith3DiscsInTower1() throws Exception {
		assertEquals(3, towerOfHanoi.numberOfDiscsIn(TOWER_1));
	}
	
	@Test
	public void moveTwoTimes() throws Exception {
		towerOfHanoi.moveDiscFrom(TOWER_1, TOWER_2);
		towerOfHanoi.moveDiscFrom(TOWER_1, TOWER_3);
		
		assertEquals(1, towerOfHanoi.numberOfDiscsIn(TOWER_1));
		assertEquals(1, towerOfHanoi.numberOfDiscsIn(TOWER_2));
		assertEquals(1, towerOfHanoi.numberOfDiscsIn(TOWER_3));
	}
	
	@Test (expected = InvalidMove.class)
	public void moveNotAllowedIfSourceTowerIsEmpty() throws Exception {
		towerOfHanoi.moveDiscFrom(TOWER_3, TOWER_2);
	}
	
	@Test
	public void startsWithDiscsInAcendingSize() throws Exception {
		assertEquals(Disc.SMALL, towerOfHanoi.removeTopDiscFrom(TOWER_1));
		assertEquals(Disc.MEDIUM, towerOfHanoi.removeTopDiscFrom(TOWER_1));
		assertEquals(Disc.LARGE, towerOfHanoi.removeTopDiscFrom(TOWER_1));
	}
	
	@Test
	public void moveNotAllowedIfDiscMovedIsBiggerThanDest() throws Exception {
		towerOfHanoi.moveDiscFrom(TOWER_1, TOWER_2);
		
		try {
			towerOfHanoi.moveDiscFrom(TOWER_1, TOWER_2);
			fail();
		} catch (Exception e) {}
	}
}
