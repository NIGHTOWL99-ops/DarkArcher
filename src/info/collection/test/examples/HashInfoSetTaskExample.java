package info.collection.test.examples;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashInfoSetTaskExample {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		
		set.add("sxq");
		set.add("wqe");
		set.add("acd");
		set.add("gfr");
		set.add("tyh");
		
		set.add("uio");
		set.add("pol");
		set.add("jhn");
		
		System.out.println(set);
		
		Map<String,Integer> map=new ConcurrentHashMap<String,Integer>();
		
		map.putIfAbsent("wqa", 1);
		map.put("wqa", 1);
		map.putIfAbsent("lkm", 9);
		map.putIfAbsent("lkmm", 9);
		map.put("lkm", 9);
		map.put("lkm", 9);
		map.put("lkm", 9);
		map.put("cvb", 9);
		map.put("nnm", 9);
		map.put("zzz", 9);
		map.put("aaa", 9);
		map.put("mkl", 9);
		map.put("iii", 9);
		map.put("uuu", 9);
		map.put("ooo", 9);
		map.put("ppp", 9);
		map.put("lll", 9);
		map.put("kkk", 9);
		map.put("jjj", 9);
		map.put("hhh", 9);
		map.put("ggg", 9);
		map.put("fff", 9);
		map.put("asd", 9);
		
		//map.clear();
		System.out.println(map);

	}

}

