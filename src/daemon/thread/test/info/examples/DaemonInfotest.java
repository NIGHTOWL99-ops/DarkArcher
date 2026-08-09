package daemon.thread.test.info.examples;

public class DaemonInfotest extends Thread{

	
	 public DaemonInfotest(String name){ 
	       super(name); 
	   } 
	   public void run() 
	   {  
	       // Checking whether the thread is Daemon or not 
	       if(Thread.currentThread().isDaemon()) 
	       {  
	           System.out.println(getName() + " is Daemon thread");  
	       }    
	       else 
	       {  
	           System.out.println(getName() + " is User thread");  
	       }  
	   } 
	   
	   public static void main(String[] args) {
		   DaemonInfotest t1 = new DaemonInfotest("t1"); 
		   DaemonInfotest t2 = new DaemonInfotest("t2"); 
		   DaemonInfotest t3 = new DaemonInfotest("t3");  
	       // Setting user thread t1 to Daemon 
	       t1.setDaemon(true);       
	       // starting first 2 threads  
	       t1.start();  
	       t2.start();   
	       // Setting user thread t3 to Daemon 
	       t3.setDaemon(true);  
	       t3.start();         
	   }  
	}

