package info.doublebraces.initialization.test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class DoubleBracesInitialisationTestExample {

	public static void main(String[] args) {
	
		@SuppressWarnings("serial")
		AbstractList<String> list=new ArrayList<String>() 

		{{
			
			add("abcd");
			add("xyz");
			
		}};
       
		System.out.println(list);
		
		Set<Integer> s=new CopyOnWriteArraySet<Integer>();
		s.add(23);
		s.add(3);
		s.add(45);
		s.add(45);
		
		System.out.println(s);
	}


}