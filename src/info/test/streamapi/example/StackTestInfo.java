package info.test.streamapi.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackTestInfo {

	public static void main(String[] args) {
		Deque<String> ad=new ArrayDeque<>();//can act as a stack
		
		ad.push("priority branch1");
		ad.push("priority branch2");
		ad.push("priority branch3");
		
		System.out.println(ad);
		
		while(!ad.isEmpty()) {
			  
			
				  //System.out.println(ad.removeFirst());
				  //System.out.println(ad.pollFirst());
				  System.out.println(ad.pop());
			  
			  }
		
		System.out.println(ad);//Last in First Out

	}

}
