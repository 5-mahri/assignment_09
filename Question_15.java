package Assignment_09;

public class Question_15 {

	public static void main(String[] args) {
		
		String s1 = "catdog";
		String s2 = "catcat";
		String s3 = "catcheetahdogcat";
		String s4 = "dogcatdogcatdogcatcatdog";
		
		sameNumber(s1);
		sameNumber(s2);
		sameNumber(s3);
		sameNumber(s4);

	}

	private static void sameNumber(String animal) {
		
		int catCount=0;
		int dogCount=0;
		
		for(int i=0; i<animal.length()-2; i++) {
			
			if(animal.subSequence(i, i+3).equals("cat")) {
				catCount++;
			}else if(animal.subSequence(i, i+3).equals("dog")) {
				dogCount++;
			}
		}
		
		if(catCount == dogCount)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
