package pokemon;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Carapuce carapuce = new Carapuce();
		Bulbizarre bulbizarre = new Bulbizarre();
		Salameche salameche = new Salameche();
		
		System.out.println(Carapuce.populationLength());
		System.out.println(Pokemon.globalPopulationSize());
		
		ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
		pokemons.add(salameche);
		pokemons.add(bulbizarre);
		pokemons.add(salameche);
		Pokemon.displayPokemon(pokemons);
		
		carapuce.attaquer();
	}
}
