package pokemon;

public class Carapuce extends Pokemon {

	String type = "water";
	private static int number = 0;
	
	public Carapuce() {
		this("carapuce", 3);
	}
	
	public Carapuce(String name, int life) {
		super();
		this.name = name;
		this.life = life;
		number++;
	}
	
	public static int populationLength() {
		return number;
	}
}
