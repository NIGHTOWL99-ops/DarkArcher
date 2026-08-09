package info.test.blockingqueue.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BQtest {

	public static void main(String[] args) throws InterruptedException {
		
		
		BlockingQueue<Integer> blockingQueue=new ArrayBlockingQueue<Integer>(3);
		
		Thread producer=new Thread( ()->{
			
			try {
				blockingQueue.put(123);
				//Thread.sleep(2000);
				blockingQueue.put(124);
				blockingQueue.put(12);
				//Thread.sleep(2000);
				System.out.println(blockingQueue);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
			
		Thread Consumer=new Thread(()->{
			
			try {
				
				System.out.println(blockingQueue.size());
				
				for(int i=0;i<blockingQueue.size();i++) {
					
					//Integer value =blockingQueue.take();
					Integer value2 =blockingQueue.take();
					//Integer value3 =blockingQueue.take();
					System.out.println("Consumed..........."+value2);
				}
								
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		});
		
		producer.start();
		
		Consumer.start();


		//System.out.println(blockingQueue);
		

	}

}
