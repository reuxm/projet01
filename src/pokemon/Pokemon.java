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
	
	public abstract String getType();
	
	public void attaquer() {
		System.out.println(this.name+" utilise une attaque "+getType());
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
		return "Espece : "+this.getClass().getSimpleName()+" {\n"
				+ "\tname : "+name+"\n"
				+ "\tlife : "+life+"\n"
				+ "\ttype : "+getType()
				+ "}"
		;
		
	}
	
}
