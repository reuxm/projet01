package pokemon;

public abstract class Pokemon {
	protected String name;
	protected int life;
	protected String type;
	private static int numberpokemon;
	
	protected Pokemon() {
		numberpokemon++;
	}
	
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
	
	public static int globalPopulationSize() {
		return numberpokemon;
	}
	
	@Override
	public String toString() {
		return this.getClass().getName()+" ---\nname : "+name+"\nlife : "+life+"\ntype : "+type;
		
	}
	
}
