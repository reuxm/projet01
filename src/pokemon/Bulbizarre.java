package pokemon;

public class Bulbizarre extends Pokemon {

	private static int number = 0;
	private static String type = "plante";
	
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

	@Override
	public String getType() {
		return this.type;
	}
}
