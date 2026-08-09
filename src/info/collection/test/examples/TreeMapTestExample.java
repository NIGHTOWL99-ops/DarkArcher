package info.collection.test.examples;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapTestExample {

	public static void main(String[] args) {
		
		
		Map<String,Integer> map=new TreeMap<>();
		map.put("sdf", 99);
		map.put("ert", 909);
		map.put("njk", 990);
		map.put("mkl", 929);
		map.put("lkop", 989);
		map.put("dew", 999);
		
		
		System.out.println(map);
		
		//map.entrySet().forEach(x->{x.getKey().toUpperCase();});
		
		for(Entry<String, Integer> entry:map.entrySet()) {
			
			String key_2=entry.getKey().toUpperCase();
			
			System.out.println(key_2);//String should be used as key element 
			
		}
		
		System.out.println(map);//String is Immutable

	}

}
