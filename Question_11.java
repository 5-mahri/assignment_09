package Assignment_09;

public class Question_11 {

	public static void main(String[] args) {
		
		String sender = "<Mike Smith>";
		String phoneNumber = "[202-123-3456]";
		String messageBody = "{I love programming and problem solving}";
		
		System.out.println("Sender: " + sender.substring(sender.indexOf("<")+1, sender.indexOf(">")));
		System.out.println("Phone Number: " + phoneNumber.substring(phoneNumber.indexOf("[")+1,phoneNumber.indexOf("]")));
		System.out.println("Message body: " + messageBody.substring(messageBody.indexOf("{")+1, messageBody.indexOf("}")));

		
	}

}
