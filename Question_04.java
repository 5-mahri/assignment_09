package Assignment_09;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		sc.close();
		
		threeMiddle(word);

	}
	
	public static void threeMiddle(String str) {
	
		if( str.length()>=5 && str.length()%2 == 1 ) {
			
			int mid = str.length()/2;
			String mid3 = str.substring(mid-1, mid+2);
			
			System.out.println(mid3);
		
		}else
			System.out.println("Not valid");
		}

}
