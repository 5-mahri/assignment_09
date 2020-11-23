package Assignment_09;

import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter word1: ");
		String word1 = sc.next();
		
		System.out.println("Enter word2: ");
		String word2 = sc.next();
		
		if (word1.length() == 3 &&  word2.length() == 3) {
			
			System.out.println(word1);
			System.out.println(word2);
			
			for( int i=0; i<word1.length(); i++ ) {
				System.out.print(word1.charAt(i));
				System.out.print(word2.charAt(i));
			}
			
		} else {
			
			System.out.println("Cannot merge");
		
		}

	}

}
