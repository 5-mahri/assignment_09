package Assignment_09;

import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int premium=0;
		
		System.out.println("Welcome to the CountyFarm car insurance!");
		System.out.print("Enter your name: ");
		String name = scan.next();
		
		System.out.print("Do you have a US driver license? ");
		String drLic = scan.next();
		
		if(drLic.equalsIgnoreCase("Yes")) {
			
			System.out.print("Enter your zip code: ");
			int zipCode = scan.nextInt();
			
			if(zipCode==20910 || zipCode==20740) {
				premium+=60;
			}else if(zipCode==22102 || zipCode==22103) {
				premium+=30;
			}else {
				premium+=50;
			}
			
			System.out.print("Is this vehicle Owned, Financed, or Leased? ");
			String tyVeh = scan.next();
			
			if(tyVeh.equalsIgnoreCase("owned")) {
				premium+=10;
			}else {
				premium+=20;
			}
			
			System.out.print("How is this vehicle primarily used? ");
			String c_usage = scan.next();
			
			if(c_usage.equalsIgnoreCase("Business")) {
				premium+=50;
			}else if(c_usage.equalsIgnoreCase("Pleasure")) {
				premium+=10;
			}else if(c_usage.equalsIgnoreCase("Commute")) {
				premium-=20;
			}
			
			System.out.print("Days Driven To Work And/Or School: ");
			int day_work = scan.nextInt();
			premium = premium + day_work*5;
			
			System.out.print("Miles Driven To Work And/Or School: ");
			int miles = scan.nextInt();
			premium = premium + miles*1;
			
			System.out.print("How old are you? ");
			int age = scan.nextInt();
			
			if(age>=16 && age<=18) {
				premium = premium * 20;
			}else if(age>=18 && age<=21) {
				premium = premium * 6;
			}else if(age>=21 && age<=25) {
				premium = premium * 2;
			}else {
				System.out.println("Invalid data!");
				System.exit(0);
			}
			
			System.out.print("Have you had any accidents in the last 5 years? ");
			String accident = scan.next();
			
			if(accident.equalsIgnoreCase("Yes")) {
				System.out.print("How many? ");
				int accNum = scan.nextInt();
				
				for (int i = 0; i < accNum; i++) {
					premium +=  (premium/100)*20;
				}
			}
			
			System.out.print("Have you had continuous insurance for the past 12 months? ");
			String cont_insurance = scan.next();
			
			if(cont_insurance.equalsIgnoreCase("No")) {
				premium*=2;
			}
			
			System.out.print("What is the highest level of education you have completed?");
			String levelEduc = scan.next();
			
			if(levelEduc.equalsIgnoreCase("PhD") || levelEduc.equalsIgnoreCase("Bachelors") || levelEduc.equalsIgnoreCase("Masters")) {
				
				premium = premium - (premium/100)*5;
			
			}else if(levelEduc.equalsIgnoreCase("Doctors")) {
				
				premium = premium - (premium/100)*10;
			
			}else if(levelEduc.equalsIgnoreCase("Less than High School")) {
				
				premium = premium + (premium/100)*5;
			}
			
			System.out.println(name + ", here's your quote!");
			System.out.println("Start Your Policy Today For: $"+premium);
			System.out.println("Reference number: "+(name.substring(0,2)+age+
					name.substring(name.length()-2)+zipCode+levelEduc).toUpperCase());	
			
		}else {
			System.out.println("Invalid Data");
		}
	}

}
