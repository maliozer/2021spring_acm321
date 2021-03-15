package ps2q1;

public class q1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
	    for (int x = 3; x <1000; ++x){
	        if ((x % 3 == 0) || (x %5 == 0)) {
	               count+=x;
	               }
	     }
	    
	    System.out.println(count);
	}

}
