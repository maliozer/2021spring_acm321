package inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Animal(0,false, "land");
		
		System.out.println(a1.getAge());
		a1.grow();
		System.out.println(a1.getAge());
		
		
		Bird b1 = new Bird(2, true, "Air", "Homing pigeon");
		
		System.out.println(b1.info_animal());
		
	}

}
