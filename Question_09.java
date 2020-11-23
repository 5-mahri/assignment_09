package Assignment_09;

public class Question_09 {

	public static void main(String[] args) {
		// reverse name/surname  
		
		String s1 = "mike_tyson@gmail.com";
		String s2 = "barakobama@gmail.com";
		reverse(s1);
		reverse(s2);

	}
	
	public static void reverse(String mail) {
		
		if(mail.contains("_")) {
			
			String [] arrMail1=mail.split("@");
			String [] arrMail2= arrMail1[0].split("_");
			String newMail = arrMail2[1]+"_"+arrMail2[0]+ "@"+arrMail1[1];
			System.out.println(newMail);
			
		}else {
			
			System.out.println(mail);

		}
	}

}
