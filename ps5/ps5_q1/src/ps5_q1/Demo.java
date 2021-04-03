package ps5_q1;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "kayak";
		String reversed_text = "";
		char temp;
		Stack<Character> s1 = new Stack<Character>();
		
		for(int i=0; i < text.length(); i++) {
			s1.push(text.charAt(i));
		}
		
		
		while(!s1.empty()) {
			temp = s1.pop();
			reversed_text += temp;
		}
		
		if(text.equals(reversed_text)) {
			System.out.println(reversed_text + " is palindrome");
		}
		else {
			System.out.println(reversed_text + " is not palindrome");
		}

	}

}
