package info.internet.test.java.examples;

import java.util.*;
import java.util.concurrent.*;
public class ConCrrntModfcionTestExample extends Thread{
	
	  static Set<String> s
	        = new CopyOnWriteArraySet<>();

	    public void run()
	    {
			/*
			 * try { Thread.currentThread().join(100);
			 * 
			 * }catch (Exception e) { // TODO: handle exception }
			 */
        
	        s.add("E");
	        System.out.println("inside child thread................");
	    }
	    public static void main(String[] args)
	    {
      
	        s.add("A");
	        s.add("B");
	        s.add("C");

	        ConCrrntModfcionTestExample t = new ConCrrntModfcionTestExample();
        
	        t.start();//Main Thread Starts the child thread
      
	        try {
	            
	            //t.join();//User Thread goes to waiting state
	            Thread.currentThread().join(100);//Main thread on waiting state
	        }
           
	        catch (InterruptedException e) {
	            System.out.println("Child thread interrupted.");
	        }

	        System.out.println(
	            "Set after child thread modification: " + s);
	        
	        Iterator<String> itr = s.iterator();//In the meantime, main thread is doing its task
	        while (itr.hasNext()) {
	            String str = itr.next();
	            System.out.println(s);

	            if (str.equals("C")) {
	                
	                s.remove(str);
	            }
	        }

	        System.out.println("Final Set: " + s);
	    }
	
}
