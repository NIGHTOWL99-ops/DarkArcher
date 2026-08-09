package info.test.streamapi.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class PushPollConfigTest {

	public static void main(String[] args) {

		
		Deque<String> dq=new ArrayDeque<String>();
		
		dq.push("English");
		dq.push("Polish");
		dq.push("India");
		dq.push("French");
		
		System.out.println("Before Polling..............."+dq);
		
		while(!dq.isEmpty()) {
		System.out.println(dq.pollLast());
		}
		System.out.println("After Polling.............."+dq);
		
	}

}
