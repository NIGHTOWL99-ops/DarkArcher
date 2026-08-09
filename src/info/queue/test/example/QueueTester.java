package info.queue.test.example;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueTester {

	public static void main(String[] args) {
		
		Set<String> s=new HashSet<>();
		s.add("edf");
		
		s.add("wsd");
		
		s.add("aqs");
		s.add("mnj");
		
		System.out.println(s);
		
		Queue<String> q=new ConcurrentLinkedDeque<String>(s);
		
		System.out.println(q);
		System.out.println(q.element());
		
		
		Queue<Integer> q1=new PriorityQueue<Integer>();
		q1.offer(443);
		q1.offer(453);
		q1.offer(111);
		//q1.add(112);
		
		System.out.println(q1);
		
		
		Queue<Integer> q2=new PriorityBlockingQueue<Integer>();
		q2.add(02);
		q2.add(33);
		q2.add(432);
		q2.add(01);
		
		q2.add(4999);
		q2.add(4999);
		System.out.println(q2);
		
		

	}

}
