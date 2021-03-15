package ps2q3;

import java.util.Scanner;

public class q3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner in = new Scanner(System.in);
		
		int v0,v1,t,a = 0;
		
		v0 = in.nextInt();
		v1 = in.nextInt();
		t = in.nextInt();
		
		in.close();
		
		a = (v1 - v0) / t;
		System.out.println("Acceleration: " + a);

	}

}
