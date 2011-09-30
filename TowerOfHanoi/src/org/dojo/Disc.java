package org.dojo;

public enum Disc {
	SMALL(1), MEDIUM(2), LARGE(3);
	
	private final int size;

	private Disc(int size) {
		this.size = size;
	}

	public boolean isLargerThan(Disc disc) {
		return size > disc.size;
	}
}
