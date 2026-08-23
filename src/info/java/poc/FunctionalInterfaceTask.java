package info.java.poc;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface TestFunctionalIntrefaceinJava{
	
	
	// developer functional interface
	// Target method for Lambda
	
	
	int Calculate(Integer x) ;
	
	//Integer Sum(int x,int y);// it's presence violets the very basic principle of functional interface
	
	default void startCalculation() {
		
		System.out.println("Calculation Started...........");
	}
	
}


public class FunctionalInterfaceTask {
	
	
	public static void main(String[] args) {
		
		System.out.println("Empty String............");
		
		TestFunctionalIntrefaceinJava testObj=( x)->x+x;
		
		System.out.println( "Output For Lambda...calculated..."+testObj.Calculate(9));
		
		testObj.startCalculation();
		
		 
		Consumer<Integer> conObj=( x)->x.byteValue();
		
		
		
		conObj.accept(90);
		System.out.println("Consumer type object.........."+conObj); //Internal method Implementation
		
		
		
		
		System.out.println("Calculation Completed .............");
		
		
		
		Predicate<Integer> predObj=(x)->x!=0;  
		
		System.out.println("Predicate Check......."+predObj.test(90));
		System.out.println("Predicate Object Type :: "+predObj.getClass());
		
		
		
		
		
		Supplier<Integer> supObj=()->Math.subtractExact(19, 1);
		System.out.println("supplier get method ................"+supObj.get());
		
		
		
		TestFunctionalIntrefaceinJavaImpl objImpl=new TestFunctionalIntrefaceinJavaImpl();
		System.out.println("Output ....using Impl Classs....calculate......"+objImpl.Calculate(9));
	}

}

