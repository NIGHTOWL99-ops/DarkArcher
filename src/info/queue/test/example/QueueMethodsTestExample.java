package info.queue.test.example;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueMethodsTestExample {

	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		s.add("cdv");
		
		
		Queue<String> q= new ArrayBlockingQueue<String>(99, true, s);
		
		q.add("kjm");
		q.add("rtr");
		q.add("ewe");
		
		System.out.println(q);

	}

}
