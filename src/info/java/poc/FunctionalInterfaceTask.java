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
		
		// Lambda way of implementation
		
		//In-Built method , Hence Lambda goes well with Consumer 
		Consumer<Integer> conObj=( x)->x.byteValue();
		
		
		// InBuilt Functional Interface
		// Target method for Lambda
		conObj.accept(9);
		System.out.println("Consumer type object.........."+conObj); //Internal method Implementation
		
		
		
		
		System.out.println("Calculation Completed .............");
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * Supplier and Predicate Examples
		 */
		
		Predicate<Integer> predObj=(x)->x!=0;  //Lambda :: Object Type
		
		System.out.println("Predicate Check......."+predObj.test(9));
		System.out.println("Predicate Object Type :: "+predObj.getClass());
		
		
		
		//No Arguments Needed , Hence not applicable for Supplier
		
		Supplier<Integer> supObj=()->Math.subtractExact(19, 1);
		System.out.println("supplier get method ................"+supObj.get());
		
		
		
		TestFunctionalIntrefaceinJavaImpl objImpl=new TestFunctionalIntrefaceinJavaImpl();
		System.out.println("Output ....using Impl Classs....calculate......"+objImpl.Calculate(9));
	}

}

