package org.dojo;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
	private List<List<Disc>> towers = new ArrayList<List<Disc>>();
	
	public TowerOfHanoi() {
		List<Disc> initialDiscs = new ArrayList<Disc>();
		initialDiscs.add(Disc.SMALL);
		initialDiscs.add(Disc.MEDIUM);
		initialDiscs.add(Disc.LARGE);
		
		towers.add(initialDiscs);
		towers.add(new ArrayList<Disc>());
		towers.add(new ArrayList<Disc>());
	}
	
	public void moveDiscFrom(int fromTower, int toTower) throws InvalidMove {
		if(towers.get(fromTower - 1).isEmpty())
			throw new InvalidMove();
		
		if(!towers.get(toTower - 1).isEmpty() && towers.get(fromTower - 1).get(0).isLargerThan(towers.get(toTower - 1).get(0)))
			throw new InvalidMove();

		Disc disc = towers.get(fromTower - 1).remove(0);
		
		towers.get(toTower - 1).add(disc);
	}

	public int numberOfDiscsIn(int tower) {
		return towers.get(tower - 1).size();
	}

	public Disc removeTopDiscFrom(int tower) {
		return towers.get(tower - 1).remove(0);
	}
}
