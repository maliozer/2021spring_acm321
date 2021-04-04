package passwordEx;

import java.util.Random;

public class Demo {
	
	public Demo() {
		
	}
	
	
	
	public String generatePassword(int length) {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!+*/-%&{[]}=0123456789";
		String password = "";
		
		Random rnd = new Random();
		int selection = 0;
		
		
		for (int i = 0; i < length; i++) {
			selection = rnd.nextInt(chars.length());
			password += chars.charAt(selection);
		}
		
		
		return password;
	}
	
	public static int[] powersOfTwoArray(int n) 
	{
	    int[] result = new int[n+1];  // use "n+1" otherwise it will throw exception
	    int i = 0;
	    int power = 1;   // initiate power = 1, not power = 0;
	    while (i <= n) 
	    {
	        result[i] = power;
	        power *= 2;
	        i++;        // increments "i" otherwise its an infinite loop
	    }
	    return result;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		
		
		System.out.println(d1.generatePassword(12));
	}

}
