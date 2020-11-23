package Assignment_09;

public class Question_07 {

	public static void main(String[] args) {
		// print first half word
		
		String word="java", w2="hi", w3="hola";
		
		firstHalfWord(word);
		firstHalfWord(w2);
		firstHalfWord(w3);

	}
	
	public static void firstHalfWord(String s) {
		
		int half=s.length()/2;
	
		System.out.println(s.substring(0, half).repeat(2));
	}

}
