package ps3q2;

public class q2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using arguments
		
		String name = "-";
		String surname = "-";
		
		if(args.length > 0) {
			name = args[0];
		}
		
		if(args.length > 1) {
			surname = args[1];
		}
		
		System.out.println(name + " " + surname); 

	}

}
