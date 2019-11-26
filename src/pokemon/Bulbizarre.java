package pokemon;

public class Bulbizarre extends Pokemon {

	public Bulbizarre( ) {
		this("bulbizarre", 2);
	}
	
	public Bulbizarre(String name, int life) {
		this.name = name;
		this.life = life;
		this.type = "grass";
	}
}
