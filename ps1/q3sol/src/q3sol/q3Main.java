package q3sol;

import java.util.Scanner;

public class q3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int choice;
		boolean flag = true; //dummy variable
		
		while(flag) {
		
			System.out.println("1. START NEW GAME");
			System.out.println("2. LOAD GAME");
			System.out.println("3. OPTIONS");
			System.out.println("4. SCORES");
			System.out.println("5. ABOUT");
			System.out.println("6. EXIT");
			
			choice = in.nextInt();
			
			switch (choice) {
			  case 1:
			    System.out.println("START NEW GAME");
			    break;
			  case 2:
			    System.out.println("LOAD GAME");
			    break;
			  case 3:
			    System.out.println("OPTIONS");
			    break;
			  case 4:
			    System.out.println("SCORES");
			    break;
			  case 5:
			    System.out.println("ABOUT");
			    break;
			  case 6:
			    System.out.println("EXIT");
			    flag = false;
			    break;
			  default:
				  System.out.println("Abort");
			}
		
		}
		
	in.close();	
	}

}
