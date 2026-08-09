package info.test.blockingqueue.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedQueueTestExample {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("a");
		
		
		
		
		BlockingQueue<String> bq=new LinkedBlockingDeque<String>();
		
		bq.add("z");
		bq.offer("c");
		try {
			bq.put("g");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		bq.drainTo(list);

		
		System.out.println(bq+"    "+list);
	}

}
