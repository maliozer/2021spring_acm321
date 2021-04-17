package inheritance;

public class Bird extends Animal {
	public String species;
	public int speed;
	
	//----constructor
	public Bird(int number_of_legs, boolean vegetarian, String habitat, String species) {
		
		super(number_of_legs, vegetarian, habitat);
		
		this.species = species;
	}
	
	//----constructor end
	
	public void setSpeed(int new_speed) {
		this.speed = new_speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public String getSpecies() {
		return this.species;
	}
	
	@Override
	public String info_animal() {
		return this.toString() + " Overrided";
	}
	
	
}
