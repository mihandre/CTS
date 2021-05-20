package ro.ase.csie.cts.g1093.dp.memento;

import java.util.Date;

public class HeroMemento {
	
	String nameString;
	int lifePoints;
	String magic;
	
	Date timestamp;

	public HeroMemento(String nameString, int lifePoints, String magic) {
		super();
		this.nameString = nameString;
		this.lifePoints = lifePoints;
		this.magic = magic;
		this.timestamp = new Date();
	}
	
	
}
