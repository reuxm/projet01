package pokemon;

public class Pokemon {
	protected String name;
	protected int life;
	protected String type;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLife() {
		return this.life;
	}
	
	public void setLife(int life) {
		this.life = Math.max(life,  0);
	}
	
	public void attaquer() {
		System.out.println(this.name+" utilise une attaque "+this.type);
	}
}
