package ps2q2;

import java.util.Scanner;

public class q2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int number = 0;
		int digit = 0;
		int sum_of_digits = 0;
		
		while(number < 1 || number > 1000) {
			number = in.nextInt();
		}
		
		in.close();
		
		
		while(number % 10 != 0) {
			digit = number %10;
			number /= 10;
			sum_of_digits += digit;
		}
		
		System.out.println("Sum of Digits: " + sum_of_digits);
		
		
	}

}
