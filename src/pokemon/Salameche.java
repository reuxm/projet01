package pokemon;

public class Salameche extends Pokemon {

	private static int number = 0;
	private static String type = "feu";
	
	public Salameche() {
		this("salameche", 1);
	}
	
	public Salameche(String name, int life) {
		super();
		this.name = name;
		this.life = life;
		number++;
	}
	
	public static int populationLength() {
		return number;
	}

	@Override
	public String getType() {
		return this.type;
	}
}
