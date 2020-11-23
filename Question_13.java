package Assignment_09;

import java.util.Scanner;

public class Question_13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter start point:");
		String start = scan.nextLine();
		
		System.out.println("Enter end point:");
		String end = scan.nextLine();
		
		scan.close();
		
		s_ePoint(start,end);
	}

	private static void s_ePoint(String s, String e) {
		
		
		 if(s.equalsIgnoreCase(e)){
		      System.out.println(s+" found");
		    }else if(s.equalsIgnoreCase("A") && e.equalsIgnoreCase("B")){
		      System.out.println("right: B found");
		    }else if(s.equalsIgnoreCase("A") && e.equalsIgnoreCase("C")){
		      System.out.println("right > down: C found");
		    }else if(s.equalsIgnoreCase("A") && e.equalsIgnoreCase("D")){
		      System.out.println("right > down > left");
		    }else if(s.equalsIgnoreCase("B") && e.equalsIgnoreCase("C")){
		      System.out.println("down: C found");
		    }else if(s.equalsIgnoreCase("B") && e.equalsIgnoreCase("D")){
		      System.out.println("down > left: D found");
		    }else if(s.equalsIgnoreCase("B") && e.equalsIgnoreCase("A")){
		      System.out.println("down > left > up: A found");
		    }else if(s.equalsIgnoreCase("C") && e.equalsIgnoreCase("D")){
		      System.out.println("left: D found");
		    }else if(s.equalsIgnoreCase("C") && e.equalsIgnoreCase("A")){
		      System.out.println("left > up: A found");
		    }else if(s.equalsIgnoreCase("C") && e.equalsIgnoreCase("B")){
		      System.out.println("left > up > right: B found");
		    }else if(s.equalsIgnoreCase("D") && e.equalsIgnoreCase("A")){
		      System.out.println("up: A found");
		    }else if(s.equalsIgnoreCase("D") && e.equalsIgnoreCase("B")){
		      System.out.println("up > right: B found");
		    }else if(s.equalsIgnoreCase("D") && e.equalsIgnoreCase("C")){
		      System.out.println("up > right > down: C found");
		    }
		
	}

}
