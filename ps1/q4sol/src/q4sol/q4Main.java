package q4sol;

import java.util.Random;

public class q4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomNumbers = new Random(); //random number generator
		int die1=2;
		int die2=1;
		int counter = 0;
		boolean dummy = true;
		
		while(dummy) {
			die1 = randomNumbers.nextInt( 6 );
			die2 = randomNumbers.nextInt( 6 );
			counter++;
			if(die1 == 1 && die2 == 1) {
				dummy = false;
			}

		}
		
		System.out.println("Snake eyes " + die1 + "-" + die2);
		System.out.println("After, " + counter + "th rolling");
	}

}
