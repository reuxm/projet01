package pokemon;

public class Bulbizarre extends Pokemon {

	String type = "grass";
	private static int number = 0;
	
	public Bulbizarre( ) {
		this("bulbizarre", 2);
	}
	
	public Bulbizarre(String name, int life) {
		super();
		this.name = name;
		this.life = life;
		number++;
	}
	
	public static int populationLength() {
		return number;
	}
}
