package pokemon;

public class Salameche extends Pokemon {

	public Salameche() {
		this("salameche", 1);
	}
	
	public Salameche(String name, int life) {
		this.name = name;
		this.life = life;
		this.type = "fire";
	}
}
