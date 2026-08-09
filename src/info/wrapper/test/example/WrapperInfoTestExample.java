package info.wrapper.test.example;
import java.util.ArrayList;
public class WrapperInfoTestExample {

	public static void main(String[] args) {
	
		   
		       // Autoboxing: primitive to wrapper
		
		       int num = 42;
		       Integer obj = num;
		       
		       
		       // Using wrapper in a collection
		       
		       ArrayList<Integer> list = new ArrayList<>();
		       list.add(10); // Autoboxing
		       list.add(20);
		       
		       
		       // Unboxing: wrapper to primitive
		       
		       int value = list.get(0);
		       System.out.println("Wrapper object: " + obj);
		       System.out.println("Primitive value: " + value);
		   
		}
	
}

