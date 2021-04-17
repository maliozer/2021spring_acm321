package inheritance;

public class Animal {
	public int width;
	public int height;
	
	public int age;
	
	public boolean vegetarian;
	public int number_of_legs;
	
	public String habitat;
	public String color;
	
	//methods
	
	public Animal(int number_of_legs, boolean vegetarian, String habitat) {
		this.number_of_legs = number_of_legs;
		this.vegetarian = vegetarian;
		this.habitat = habitat;
		
		this.age = 0;
	}
	
	public void grow(){
		this.age++;
	}
	
	public String getAge() {
		String text = this.age + " year-old";
		return text;
	}

	public String info_animal() {
		return this.toString();
	}
	
	
}
