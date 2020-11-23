package Assignment_09;

public class Question_12 {

	public static void main(String[] args) {
		
		 String s = "xHiX";
	     String s1 = "apple";
	     String s2 = "xUxL";
	     String s3 = "JavaX";
	     
	     printWithoutXx(s);
	     printWithoutXx(s1);
	     printWithoutXx(s2);
	     printWithoutXx(s3);

	}

	private static void printWithoutXx(String str) {
		
		if(str.startsWith("x") && str.endsWith("X")) {
			
			System.out.println(str.substring(1, str.length()-1));
		
		}else if(str.startsWith("x") && !str.endsWith("X")) {
		
			System.out.println(str.substring(1, str.length()));
		
		}else if(!str.startsWith("x") && str.endsWith("X")) {
			
			System.out.println(str.substring(0, str.length()-1));
		
		}else if(!str.startsWith("x") && !str.endsWith("X")){
			
			System.out.println(str.substring(0));
		}
		
	}

}
