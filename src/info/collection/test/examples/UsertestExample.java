package info.collection.test.examples;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class UsertestExample {
	
	private final String name ;
	private final Integer age;
	@SuppressWarnings("unused")
	private final Map<String,Integer> metadata;
	
	public Map<String, Integer> getMetadata() {
		Map<String,Integer> tempdata=new  HashMap<>();
		return tempdata;
	}


	public String getName() {
		return name;
	}


	public Integer getAge() {
		return age;
	}


	public Date getJoiningDate() {
		return joiningDate;
	}


	private final Date joiningDate;
	
	
	public UsertestExample(String name,Integer age,Date date,Map<String,Integer> metadata) {
		
		Map<String,Integer> tempdata=new  HashMap<>();
		
		this.name=name;
		this.age = age;
		this.metadata = tempdata;
		this.joiningDate = date;
		
		
	}
	
	
	

}
