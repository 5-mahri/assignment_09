package Assignment_09;

public class Question_10 {

	public static void main(String[] args) {
		// Separate email
		
		String mail = "craig_federighi@apple.com";
		
		separate(mail);

	}
	
	public static void separate(String s) {
		
		System.out.println("First name: " + s.substring(0, s.indexOf("_")).toUpperCase());
		System.out.println("Last name: " + s.substring(s.indexOf("_")+1, s.indexOf("@")).toUpperCase());
		System.out.println("Domain: " + s.substring(s.indexOf("@")+1 , s.indexOf(".")));
		System.out.println("Top-Level Domain: " + s.substring(s.indexOf(".")+1));
	}

}
