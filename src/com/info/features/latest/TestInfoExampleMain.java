package com.info.features.latest;

public class TestInfoExampleMain {
	
	public static void main(String[] args) {
		EmployeeShareholderTestExample emp1=new EmployeeShareholderTestExample(123, "asdc", "kjlm");
		
		System.out.println(emp1.Dept());
		
		
		
		EmployeeShareholderTestExample emp2=new EmployeeShareholderTestExample(1239, "asdc", "kjlm");
	
	    System.out.println(emp1.equals(emp2));
	    
	    System.out.println(emp1+"   "+emp2);
	
	}

}
