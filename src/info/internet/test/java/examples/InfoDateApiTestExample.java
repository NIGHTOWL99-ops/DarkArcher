package info.internet.test.java.examples;

import java.util.Date;

public class InfoDateApiTestExample {

	public static void main(String[] args) {
		
		Date date=new Date();
		//date.toInstant();
        date.before(date );
		
		System.out.println(date);
	}

}
