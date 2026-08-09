package info.test.streamapi.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class OfferAddInfoTestExample {

	public static void main(String[] args) {
		
		
Deque<String> ad=new ArrayDeque<>();
		
		ad.offer("civil");//Offer is the same as add method, insertion is towards the tail of the queue
		ad.offer("non-engineering");
		ad.offer("civil-2");
		ad.offer("non-engineering-2");
		ad.offer("civil-3");
		ad.offer("non-engineering-3");
		
		
		ad.add("difference-1");
		ad.add("difference-2");
		
		System.out.println(ad );

	}

}
