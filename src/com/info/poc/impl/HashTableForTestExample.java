package com.info.poc.impl;

import java.util.Hashtable;
import java.util.Map;

public class HashTableForTestExample {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map=new Hashtable<String,Integer>();
		map.put("sdff", 9);
		map.put("cfg", 99);
		map.put("mnb", 8);
		map.put("nmk", 1);
		
		System.out.println(map);
	}

}
