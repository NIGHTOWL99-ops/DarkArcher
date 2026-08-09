package info.test.stringmethods.eample;

public class StringTestExample {

	public static void main(String[] args) {
		
		
		String str=new String("mmm");
		str="axxxvvvv";
		
		
		System.out.println(str);
		System.out.println(str.indexOf("v"));//first occurence
		
		
		System.out.println(str.codePointAt(4));// Unicode point
		
		
		System.out.println(str.codePointCount(0, 7));// unicode value  of the char
		
		System.out.println(str.contains("x"));//true
		
		
		
		
		System.out.println(str.contentEquals("erfe"));//false
		
		
		System.out.println(str.resolveConstantDesc(null));
		
		System.out.println(str.compareTo("unmjhbggg"));
		
		System.out.println(str.charAt(0));
		
		System.out.println(str.concat("wxw"));//string tasks/new string
		
		System.out.println(str);//original
		
		System.out.println(str.codePointCount(0, 0));
		
		System.out.println(str.chars().count());//Immutability??
		
		
		
		
		

	}

}
