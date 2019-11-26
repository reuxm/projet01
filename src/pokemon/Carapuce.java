package pokemon;

public class Carapuce extends Pokemon {

	public Carapuce() {
		this("carapuce", 3);
	}
	
	public Carapuce(String name, int life) {
		this.name = name;
		this.life = life;
		this.type = "water";
	}
}
