package q1sol;

import java.util.Scanner;

public class q1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String userName = "";
		
		System.out.print("Enter username: ");
		
		userName = in.nextLine();  // Read user input
		userName = userName.toUpperCase();
		
		if(userName.equals("JOHN")) {
			System.out.println("Hello " + userName + ", nice to meet you!");
		}
		else {
			System.out.println("Hi..");
		}
		
		in.close();
	}

}
