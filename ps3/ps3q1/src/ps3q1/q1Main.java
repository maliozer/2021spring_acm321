package ps3q1;

public class q1Main {

	public static void main(String[] args) {
		int[] values = {7,322,90,4,66,2,132,97,3,21};
		
		//find min value max value
		int min = values[0];
		int max = values[0];
		
		for (int i = 1; i < values.length; i++) {
			if(min > values[i]) {
				min = values[i];
			}
			
			if(max < values[i]) {
				max = values[i];
			}
			
		}
		
		
		
		System.out.println("Min: " + min + " Max: " + max);
		

	}

}
