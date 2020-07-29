package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Bulbasaur;
import model.Pokemon;

public class TestBulbasaur {
	
	@Test
	public void testCharacteristicsMethod() {
		Bulbasaur bulbasaur = new Bulbasaur("bulbsaur",4,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.","POISON","IVYSAUR",64);
		String temp = "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.";
		assertEquals(temp,bulbasaur.getCharacteristics());		
		try {
			Bulbasaur bulb = new Bulbasaur(null,0,null,null,null,0);
			temp = null;
			bulb.getCharacteristics();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTypeMethod() {
		Bulbasaur bulbasaur = new Bulbasaur("bulbsaur",4,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.","POISON","IVYSAUR",64);
		String temp = "POISON";
		assertEquals(temp,bulbasaur.getType());		
		try {
			Bulbasaur p1 = new Bulbasaur(null,0,null,null,null,0);
			temp = null;
			p1.getType();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEvolutionMethod() {
		Bulbasaur bulbasaur = new Bulbasaur("bulbsaur",4,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.","POISON","IVYSAUR",64);
		String temp = "IVYSAUR";
		assertEquals(temp,bulbasaur.getEvolution());		
		try {
			Bulbasaur p1 = new Bulbasaur(null,0,null,null,null,0);
			temp = null;
			p1.getEvolution();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBaseExpMethod() {
		Bulbasaur bulbasaur = new Bulbasaur("bulbsaur",4,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.","POISON","IVYSAUR",64);
		int temp = 64;
		assertEquals(temp,bulbasaur.getBaseExp());		
		try {
			Bulbasaur p1 = new Bulbasaur(null,0,null,null,null,0);
			temp = 0;
			p1.getBaseExp();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}


