package info.queue.test.example;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueInfotestExample {
	
	
	public static void main(String[] args) {
		
		Queue<String> q=new  ConcurrentLinkedQueue<String>();
		
		
		
		
		/*
		 * System.out.println(q.peek());
		 * 
		 * System.out.println(q.element());
		 */
		
		q.offer("zsa");
		q.offer("abv");
		q.offer("cfd");
		
		q.add("ert");
		
		//System.out.println(q.element());
		
		System.out.println(q);
		
		
	}

}
