package pokemon;

public class Salameche extends Pokemon {

	private static int number = 0;
	
	public Salameche() {
		this("salameche", 1);
	}
	
	public Salameche(String name, int life) {
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
		return "feu";
	}
}
