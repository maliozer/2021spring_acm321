package ps4q4;

public class Person {
	//properties
	String name;
	String surname;
	int age;
	String nationality;
	
	//method
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public int toplama(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public int toplama(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("abc", "surname");
		p1.toplama(10, 20);
		
		p1.toplama(10, 20, 30);
		
		p1.top
		
		
		Person p2 = new Person("xyz", "srnm", 18);

	}

}
