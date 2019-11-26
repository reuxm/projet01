package pokemon;

public class Bulbizarre extends Pokemon {

	private static int number = 0;
	
	public Bulbizarre( ) {
		this("bulbizarre", 2);
	}
	
	public Bulbizarre(String name, int life) {
		super();
		this.name = name;
		this.life = life;
		this.type = "grass";
		number++;
	}
	
	public static int populationLength() {
		return number;
	}
}
