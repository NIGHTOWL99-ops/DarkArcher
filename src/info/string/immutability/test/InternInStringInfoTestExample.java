package info.string.immutability.test;

public class InternInStringInfoTestExample {

	public static void main(String[] args) {
		String str1 = new String("Scaler by InterviewBit").intern();  //Line1  
		String str2 = new String("Scaler by InterviewBit").intern(); //Line2  
		System.out.println(str1 == str2); //prints true

	}

}
