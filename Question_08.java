package Assignment_09;

public class Question_08 {

	public static void main(String[] args) {
		// read email
		
		String email1 = "dear alejandro.....alot of text";
		String email2 = "thunder blaz is the best drink in the galaxy...";
		String email3 = "important project, Alejandro we refer to you this ....";
		
		readMail(email1);
		readMail(email2);
		readMail(email3);

	}
	
	public static void readMail(String text) {
		
		text.toLowerCase();
		if(text.contains("alejandro")) 
			System.out.println("Read mail");
		else 
			System.out.println("Don't read");
	}

}
