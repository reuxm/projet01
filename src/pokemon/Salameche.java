package pokemon;

public class Salameche extends Pokemon {

	private static int number = 0;
	
	public Salameche() {
		this("salameche", 1);
	}
	
	public Salameche(String name, int life) {
		super();
		this.name = name;
		this.life = life;
		this.type = "fire";
		number++;
	}
	
	public static int populationLength() {
		return number;
	}
}
