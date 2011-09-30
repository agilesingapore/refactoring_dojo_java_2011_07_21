package org.dojo;

import java.util.ArrayList;
import java.util.List;

public class Towers {
	private List<List<Disc>> towers = new ArrayList<List<Disc>>();

	public Towers() {
		List<Disc> initialDiscs = new ArrayList<Disc>();
		initialDiscs.add(Disc.SMALL);
		initialDiscs.add(Disc.MEDIUM);
		initialDiscs.add(Disc.LARGE);
		
		towers.add(initialDiscs);
		towers.add(new ArrayList<Disc>());
		towers.add(new ArrayList<Disc>());
		
	}
	public List<List<Disc>> getTowers() {
		return towers;
	}
	public List<Disc> get(int number) {
		return towers.get(number - 1);
	}

}
