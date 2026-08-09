package info.test.streamapi.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class StreamAPITestTask {
	public static void main(String[] args) {
		
		
		
		
		Deque<String> ad=new ArrayDeque<>();
		ad.add("etc");
		ad.add("cse");
		ad.add("eee");
		
		
		System.out.println(ad);// [etc,cse,eee]
		
		ad.addFirst("it");//[it,etc,cse,eee]
		ad.addLast("mechanical");//[it,etc,cse,eee,mechanical]
		ad.addLast("elc");//[it,etc,cse,eee,mecchanical,elc]
		
		System.out.println(ad);
		
		System.out.println(ad.peek());
		System.out.println("after peek......"+ad);
		System.out.println(ad.pop());
		System.out.println("after pop..........."+ad);
		System.out.println(ad.poll());
		
		System.out.println("after poll..........."+ad);
		
		
		  while(!ad.isEmpty()) {
		  
		  //First in First out 
			  System.out.println("StreamAPITestTask.main()"+ad);
			  System.out.println(ad.poll());
		  
		  }
		 
		System.out.println("After Polling............");
		
		System.out.println("values are ........."+ad.peek());
		
		ad.offer("civil");
		ad.offer("non-engineering");
		ad.push("priority branch1");
		ad.push("priority branch2");
		ad.push("priority branch3");
		
		System.out.println(ad);
		System.out.println("Last in First Out................");
		System.out.println( ad.pop());
	}
	
	
	
	

}
