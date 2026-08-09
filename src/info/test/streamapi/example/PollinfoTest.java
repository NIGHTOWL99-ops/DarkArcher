package info.test.streamapi.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class PollinfoTest {
	public static void main(String[] args) {
		
	
	Deque<String> ad=new ArrayDeque<>();
	ad.add("etc");
	ad.add("cse");
	ad.add("eee");
	
	
	System.out.println(ad);
	
	ad.addFirst("it");
	ad.addLast("mechanical");
	ad.addLast("elc");
	
	ad.push("goc");
	
	System.out.println(ad);
	
	
	while(!ad.isEmpty()) {
		  
		  //First in First out 
			  
			  System.out.println(ad.poll());
			  
			  //System.out.println(ad.pop());
		  
	}
	
	System.out.println("After Polling............"+ad);

}}
