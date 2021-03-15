package ps2q5;

public class q5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "RADAR";
		
		int i = 0;
		int j = text.length() - 1;
		
		boolean is_palindrome = true; //dummy 
		
		while(i < j) {
			if(text.charAt(i) != text.charAt(j)) {
				is_palindrome = false;
				break;
			}
			
			i++;
			j--;
		}
		
		if(is_palindrome) {
			System.out.println(text + " is palindrome");
		}
		else {
			System.out.println(text + " is not palindrome");
		}
		
		
	}

}
