package pokemon;

public class Salameche extends Pokemon {

	public static String type = "fire";
	private static int number = 0;
	
	public Salameche() {
		this("salameche", 1);
	}
	
	public Salameche(String name, int life) {
		this.name = name;
		this.life = life;
		number++;
	}
}
