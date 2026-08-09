package info.test.thread.methods.example;

public class InfoOnYieldMethodTest {

	public static void main(String[] args) {
		
		Producer p=new Producer();
		Consumer c=new Consumer();
		
		
		p.start();
		c.start();

	}
 
}
