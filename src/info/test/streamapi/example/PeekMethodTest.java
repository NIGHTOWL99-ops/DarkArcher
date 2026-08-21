package info.test.streamapi.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class PeekMethodTest {

	public static void main(String[] args) {
		
		Deque<String> ad=new ArrayDeque<>();
		ad.add("etc"); 
		ad.add("cse");
		ad.add("eee");
		
		
		//System.out.println(ad);
		
		ad.addFirst("it");
		ad.addLast("mechanical");
		ad.addLast("elc");
		
		ad.push("goc");
		ad.addFirst("it-2");
		
		System.out.println(ad);//it-2,goc,it,etc,cse,eee,mechanical,elc,
		  
				  System.out.println(ad.peek());
			  
			  System.out.println(ad);

	}

}
