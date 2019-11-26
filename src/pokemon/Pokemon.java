package pokemon;

import java.util.ArrayList;

public abstract class Pokemon {
	protected String name;
	protected int life;
	protected String type;
	private static int numberpokemon;
	
	protected Pokemon() {
		numberpokemon++;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLife() {
		return this.life;
	}
	
	public void setLife(int life) {
		this.life = Math.max(life,  0);
	}
	
	public void attaquer() {
		System.out.println(this.name+" utilise une attaque "+this.type);
	}
	
	public static int globalPopulationSize() {
		return numberpokemon;
	}
	
	public static void displayPokemon(ArrayList<Pokemon> pokemons) {
		for (Pokemon pokemon :pokemons) {
			System.out.println(pokemon);
		}
	}
	
	@Override
	public String toString() {
		return this.getClass().getName()+" ---\nname : "+name+"\nlife : "+life+"\ntype : "+type;
		
	}
	
}
