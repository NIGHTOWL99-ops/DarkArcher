package info.test.thread.methods.example;

public class JointestInfoExample {

	public static void main(String[] args) {
		
		Producer p=new Producer();
		
		Consumer c=new Consumer();
		
		/*
		 * try { Thread.currentThread().join(); } catch (InterruptedException e1) { //
		 * TODO Auto-generated catch block e1.printStackTrace(); }
		 */
		try {
		p.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
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
