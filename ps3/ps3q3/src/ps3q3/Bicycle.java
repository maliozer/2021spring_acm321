package ps3q3;

public class Bicycle {
	//properties & attributes
	public String brand;
	private int speed;
	private int gear;
	

	//constructor method
	public Bicycle() {
			speed = 0;
			gear = 1;
			brand = "NonDefined";
		}
	//methods
	
	//accessors 
	public int getSpeed() {
		return this.speed;
	}
	
	//mutators
	public void setSpeed(int speed) {
		if(speed > 0) {
			this.speed = speed;
		}
		
	}
	
	public void speedUp(int increment) {
		this.speed += increment;
	}
	
	public void setGear(int newGear) {
		gear = newGear;
	}
	
}
