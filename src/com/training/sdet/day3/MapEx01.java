package com.training.sdet.day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Alfred", 4105);
		map.put("Bertha", 5002);
		map.put("Charles", 1503);
		map.put("Denver", 2240);
		map.put("Elsie", 4105);
		
		System.out.println("Charles' Balance = " + map.get("Charles"));
		
		Set s = map.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry element = (Entry) itr.next();
			System.out.println("Key:	" + element.getKey() + "	Value:	" + element.getValue());
		}
	}
}
