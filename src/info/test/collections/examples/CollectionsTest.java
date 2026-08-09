package info.test.collections.examples;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionsTest {

	public static void main(String[] args) {
		
		AbstractList<String> al=new ArrayList<>();
		
		al.add("aaa");
		
		al.add("ccc");
		
		
		
		for(String s:al) {
			
			if(s.startsWith("a")) {
				
				System.out.println(s);
				
				
			}
		}
		
		ListIterator<String> list=al.listIterator();
		
		list.add("mmm");
		
		System.out.println(al);
		
		
	}

}
