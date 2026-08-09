package info.test.blockingqueue.example;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueueExample {
	
	
	public static void main(String[] args) {
		
		Queue<Integer> q=new ArrayDeque<Integer> ();//Circular Array Mechanism for resizing
		
		q.add(99);
		q.add(1);
		q.add(9);
		q.add(0);
		q.add(6);
		q.add(7);
		q.add(99);
		q.add(5555);
		q.add(8);
		q.add(31);
		
		q.add(13);
		q.add(65);
		q.add(88);
		q.add(87);
		q.add(99);
		q.add(89);
		
		q.add(44);
		q.add(80);
		
		System.out.println(q);
	}

}
