package Assignment_09;

import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {
		// Reverse word
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your word: ");
		String word = sc.next();
		sc.close();
		
		reverse(word);

	}
	
	public static void reverse(String s) {
		
		String sReversed="";
		
		if( s.length() == 5) {
			
			for( int i=s.length()-1; i>=0; i-- ) {
				
				sReversed+=s.charAt(i);
			}
			
			System.out.print(sReversed);
			
		
		}else if(s.length() < 5) {
			
			System.out.println("Too short");
		
		}else
			System.out.println("Too long");
	}

}
