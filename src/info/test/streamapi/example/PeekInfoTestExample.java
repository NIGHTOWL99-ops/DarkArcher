package info.test.streamapi.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class PeekInfoTestExample {

	public static void main(String[] args) {
		
		
Deque<String> dq=new ArrayDeque<String>();
		
		dq.push("English");
		dq.push("Polish");
		dq.push("India");
		dq.push("French");
		
		System.out.println("Before peek..............."+dq);//peek or view 
		
		for(int i=1;i<=dq.size();i++) {
			
			
			System.out.println("peeked....."+dq.peek());//Only One element i.e. the head of this queue always
		}

	}

}
