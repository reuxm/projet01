package pokemon;

public class Carapuce extends Pokemon {

	public static String type = "water";
	private static int number = 0;
	
	public Carapuce() {
		this("carapuce", 3);
	}
	
	public Carapuce(String name, int life) {
		this.name = name;
		this.life = life;
		number++;
	}
}
