package Assignment_09;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		boolean b;
		
		System.out.println("Split or No split: ");
		String split = sc.next();
		
		if(split.equalsIgnoreCase("yes")) {
			b = true;
		}else {
			b = false;
		}
		
		System.out.println("Enter number of people: ");
		int numP = sc.nextInt();
		
		System.out.println("Enter check amount");
		double amount = sc.nextDouble();
		
		System.out.println("Enter service quality: ");
		String quality = sc.next();
		
		tipCalculator(b,numP, amount, quality);
		

	}
	
	public static void tipCalculator(boolean isSplit, int numPeople, double checkAmount, String serviceQuality) {
		
		double totalTip=0, totalPay=0, totalPerson=0, tipPerson=0;
		String pNum="";
		
		for (int i=0; i<numPeople; i++) {
			pNum+="&";
		}
		
		switch (serviceQuality) {
		case "Poor":
			totalTip = (checkAmount*5)/100;
			break;
		case "Fair":
			totalTip = (checkAmount*10)/100;
			break;
		case "Good":
			totalTip = (checkAmount*15)/100;
			break;
		case "Great":
			totalTip = (checkAmount*20)/100;
			break;
		case "Excellent":
			totalTip = (checkAmount*25)/100;
			break;
		default:
			break;
		}
		
		
		
	if (isSplit) {
		System.out.println("Number of people: " + pNum);
		System.out.println("Total to pay: " + (checkAmount+totalTip));
		System.out.println("Total tip: " + totalTip);
		System.out.println("Total per person: " + ((checkAmount+totalTip)/numPeople));
		System.out.println("Tip per person: " + (totalTip/numPeople));
		
	}else {
		System.out.println("Number of people: " + pNum);
		System.out.println("Total to pay: " + (checkAmount+totalTip));
		System.out.println("Total tip: " + totalTip);
	}
		
		
		
	}

}
