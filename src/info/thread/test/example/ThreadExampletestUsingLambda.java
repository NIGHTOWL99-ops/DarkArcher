package info.thread.test.example;

public class ThreadExampletestUsingLambda {

	public static void main(String[] args) {
		
		
		
		  Thread t=new Thread(
		  
		  ()->{System.out.println(Thread.currentThread().getName()+" is running via Lambda!");
		  
		  },"Lambda-Thread");
		 
				
		t.start();
				
				 
		
	}

}
