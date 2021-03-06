/**
 * generate number of n=600 times random number between 1-6 (lets say it's rolling a die)
 * and count the frequency for each value
 * 
 * 
 */
package ps1q1;

import java.util.Random;

public class q1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random randomNumbers = new Random(); //random number generator
		int frequency[] = new int[7]; 		 //array of frequency counters
		
		//roll die 6000 times; use die value as frequency index
		for( int roll = 1; roll <= 600; roll++) {
			++frequency[ 1 + randomNumbers.nextInt( 6 )];
		}
		
		//output each array element's value
		for ( int face = 1; face < frequency.length; face++ ) {
			System.out.printf( "%5s%2d%5s%2d\n", "Number: ",face," Frequency: ", frequency[ face ] );
		}
		
		
		System.out.println("ACM321-Helloworld");
		
	}

}
