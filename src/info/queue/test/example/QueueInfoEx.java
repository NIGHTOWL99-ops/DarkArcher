package info.queue.test.example;

import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueInfoEx {

	public static void main(String[] args) {
		
		
		Set<String> set=new TreeSet<>();
		Queue<String> q=new ConcurrentLinkedQueue<String>(set);
		
		System.out.println(q);

	}

}
