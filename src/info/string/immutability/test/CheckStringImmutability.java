package info.string.immutability.test;

public class CheckStringImmutability {
	
	public static void main(String[] args) {
		
		
		String str="name";
		str="college";// Content Replaced
		str.toUpperCase();// Content can not be Modified
		System.out.println(str);
		String s= new String(str);//New Object
		//s="sports";
		
		System.out.println(s);
		
		System.out.println(s.equals(str));//true
		
		System.out.println(s==str);//false
		
		String s1 = "abc";
		s1.concat("def"); // Doesn’t modify 's'
		System.out.println(s1); // still "abc"
	}
	

}
