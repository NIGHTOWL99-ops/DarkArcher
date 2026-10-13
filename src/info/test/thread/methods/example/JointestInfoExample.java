package info.test.thread.methods.example;

public class JointestInfoExample {

	public static void main(String[] args) {
		
		Producer p=new Producer();
		
		Consumer c=new Consumer();
		
		
		
			p.start();
			//p.join();
			c.start();
			System.out.println("Current Thread,..........."+Thread.currentThread().getName());
			/*
			 * } catch (InterruptedException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */

	}

}
