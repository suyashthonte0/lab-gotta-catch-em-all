package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Charizard;
import model.Dragonite;

public class TestDragonite {
	@Test
	public void testCharacteristicsMethod() {
		Dragonite p = new Dragonite("AAA",4,"Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.","DRAGON","DRATINI",270);
		String temp = "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.";
		assertEquals(temp,p.getCharacteristics());		
		try {
			Dragonite p1 = new Dragonite(null,0,null,null,null,0);
			temp = null;
			p1.getCharacteristics();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTypeMethod() {
		Dragonite p = new Dragonite("AAA",4,"Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.","DRAGON","DRATINI",270);
		String temp = "DRAGON";
		assertEquals(temp,p.getType());		
		try {
			Dragonite p1 = new Dragonite(null,0,null,null,null,0);
			temp = null;
			p1.getType();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEvolutionMethod() {
		Dragonite p = new Dragonite("AAA",4,"Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.","DRAGON","DRATINI",270);
		String temp = "DRATINI";
		assertEquals(temp,p.getEvolution());		
		try {
			Dragonite p1 = new Dragonite(null,0,null,null,null,0);
			temp = null;
			p1.getEvolution();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBaseExpMethod() {
		Dragonite p = new Dragonite("AAA",4,"Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.","DRAGON","DRATINI",270);
		int temp = 270;
		assertEquals(temp,p.getBaseExp());		
		try {
			Dragonite p1 = new Dragonite(null,0,null,null,null,0);
			temp = 0;
			p1.getBaseExp();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

