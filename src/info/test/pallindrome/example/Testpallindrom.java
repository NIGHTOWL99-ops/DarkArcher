package info.test.pallindrome.example;

public class Testpallindrom {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		String str="kjh";
		
		System.out.println(str.valueOf(str));
		
		String str_2=new StringBuilder(str).reverse().toString();
		
		System.out.println(str.equals(str_2));

	}

}
