package Assignment_09;

import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 String word = sc.nextLine();
		 printMiddle(word);

	}
	
	public static void printMiddle(String str) {
		
		if( str.length()>=3 && str.length()%2 == 1 ) {
			
			int mid = str.length()/2;
			System.out.println(str.charAt(mid));
		
		}else if( str.length() == 1 ) {
			
			for(int i=0; i<3; i++) {
				System.out.print(str.charAt(str.length()-1));
			}
		
		}else if( str.length()>=4 && str.length()%2 == 0 ) {
			
			int mid = str.length()/2;
			System.out.println(str.substring(mid-1,mid+1));
		
		}else if( str.length() == 2 ) {
				//System.out.print(str.repeat(2));	
			for(int i=0; i<2; i++) {
				System.out.print(str.substring(0,(str.length())));
			}

		}
	}

}
