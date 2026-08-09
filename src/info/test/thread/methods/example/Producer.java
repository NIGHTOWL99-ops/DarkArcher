package info.test.thread.methods.example;

public class Producer extends Thread{
	
	
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		
		//this.yield();
		try {
			this.join(100);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("producer............");
	}

}
