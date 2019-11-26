package pokemon;

public class Bulbizarre extends Pokemon {

	private static int number = 0;
	
	public Bulbizarre( ) {
		this("bulbizarre", 2);
	}
	
	public Bulbizarre(String name, int life) {
		super();//update global pokemon count
		this.name = name;
		this.life = life;
		number++;
	}
	
	public static int populationLength() {
		return number;
	}

	@Override
	public String getType() {
		return "plante";
	}
}
