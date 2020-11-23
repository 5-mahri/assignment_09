package Assignment_09;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
			
		double priceLaptop=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select screen size:");
		double screenSize=sc.nextDouble();
		
		System.out.println("Select CPU type:");
		String typeCPU=sc.next();
		
		System.out.println("Select RAM:");
		int ram=sc.nextInt();
		
		System.out.println("Select storage type:");
		String  storage=sc.next();
		
		System.out.println("Select memory size:");
		int  memorySize=sc.nextInt();
		
		System.out.println("Select screen resolution:");
		String  screenRes=sc.next();
		
		if(screenSize == 13.3) {
			priceLaptop+=200;
		}else if(screenSize == 15.0) {
			priceLaptop+=300;
		}else if(screenSize == 17.0) {
			priceLaptop+=400;
		}
		
		if(typeCPU.equalsIgnoreCase("i3")) {
			priceLaptop+=150;
		}else if(typeCPU.equalsIgnoreCase("i5")) {
			priceLaptop+=250;
		}else if(typeCPU.equalsIgnoreCase("i7")) {
			priceLaptop+=350;
		}
		
		priceLaptop+=(ram/4)*50;
		
		if(storage.equalsIgnoreCase("SSD")) {
			priceLaptop+=(memorySize/500)*100;
		}else if(storage.equalsIgnoreCase("HDD")) {
			priceLaptop+=(memorySize/500)*50;
		}
		
		if(screenRes.equalsIgnoreCase("FULLHD")) {
			priceLaptop+=100;
		}else if(screenRes.equalsIgnoreCase("4K")) {
			priceLaptop+=200;
			}
		System.out.println("Laptop price is: $" + priceLaptop);
	}

}
