package info.collection.test.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestTreesetExample {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("jkl","opl","gdf","ert");
		
		Set<String> strSet=new TreeSet<String>();
		strSet.add("ddd");
		strSet.add("xed");
		
		strSet.addAll(list);
		
		
		System.out.println(strSet);

	}

}
