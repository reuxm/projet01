package pokemon;

public class Carapuce extends Pokemon {

	private static int number = 0;
	
	public Carapuce() {
		this("carapuce", 3);
	}
	
	public Carapuce(String name, int life) {
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
		return "eau";
	}
}
