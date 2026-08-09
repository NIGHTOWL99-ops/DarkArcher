package info.test.collections.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTestExample {

	public static void main(String[] args) {
		
		
		List<Number> list=new ArrayList<>();
		
		list.add(123);
		list.add(443);
		list.add(555);
		
		System.out.println("Before Removal.................."+list);
		
		
		Iterator<Number> l=list.listIterator();
		
		while (l.hasNext()) {
			
			System.out.println(l.next());
			
			l.remove();
			
		}

		
		System.out.println("After Removal ................."+list);
	}

}
