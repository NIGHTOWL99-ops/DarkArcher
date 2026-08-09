package info.string.immutability.test;

public class TestStringInternMethodExample {
	
	public static void main(String[] args) {
		
		
		String str1="rttr";
		
        String str2=str1.intern();//Already inside the pool,same content
        
        
        String str3=new String("wwe").intern();//Moves from heap area to string pool area
        
        
        System.out.println(str3==str1);//false
        
        System.out.println(str1==str2);//true
	}

}
