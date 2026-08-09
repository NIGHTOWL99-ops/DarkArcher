package info.callback.test.example;

import java.util.function.Consumer;

public class CalbacktestExample {
	
	
	public static void performTask(String data, Consumer<String> callback) {
        System.out.println("Processing: " + data);
        String result = data.toUpperCase();
        
        // Execute the callback function with the result
        callback.accept(result); //consumer calls back its lambda function 
    }
	public static void main(String[] args) {
		// Method that accepts a callback function via the Consumer interface
	     

	    
	        // Pass a lambda expression as the callback function
	        performTask("hello world", (res) -> {
	            System.out.println("Callback triggered! Result: " + res);// first function call to consumer
	        });
	    
	        
	        
	}

}
