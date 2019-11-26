package pokemon;

public class Bulbizarre extends Pokemon {

	public static String type = "grass";
	private static int number = 0;
	
	public Bulbizarre( ) {
		this("bulbizarre", 2);
	}
	
	public Bulbizarre(String name, int life) {
		this.name = name;
		this.life = life;
		number++;
	}
}
