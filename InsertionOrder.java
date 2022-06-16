package com.Task_05_05_22;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class InsertionOrder {
	Scanner oScanner = new Scanner(System.in);

	public void HashMap() {
		System.out.println("----------HashMap Insertion Order--------");
		System.out.println("Enter the elements count :");
		int count = oScanner.nextInt();
		HashMap<String, Integer> dataHashMap = new HashMap<>();
		for (int index = 0; index < count; index++) {

			System.out.println("Enter the key elemet :");
			String key = oScanner.next();
			System.out.println("Enter the value element :");
			Integer value = oScanner.nextInt();
			dataHashMap.put(key, value);

		}

		System.out.println("Iterating HashMap");
		for (Map.Entry insertion : dataHashMap.entrySet()) {
			System.out.println("Key " + insertion.getKey() + " ,Value " + insertion.getValue());
		}
	}

	public void LinkedHashMap() {
		System.out.println("----------LinkedHashMap Insertion Order--------");
		System.out.println("Enter the elements count you need :");
		int count = oScanner.nextInt();
		LinkedHashMap<String, Integer> dataLinkedHashMap = new LinkedHashMap<>();
		for (int index = 0; index < count; index++) {

			System.out.println("Enter the key elemet :");
			String key = oScanner.next();
			System.out.println("Enter the value element :");
			Integer value = oScanner.nextInt();
			dataLinkedHashMap.put(key, value);

		}
		System.out.println(dataLinkedHashMap);
		System.out.println("Iterating LinkedHashMap HashMap");
		for (Map.Entry insertion : dataLinkedHashMap.entrySet()) {
			System.out.println("Key " + insertion.getKey() + " ,Value " + insertion.getValue());
		}
	}

	public void TreeMap() {
		System.out.println("----------TreeMap Insertion Order--------");
		System.out.println("Enter the elements count you need :");
		int count = oScanner.nextInt();
		TreeMap<String, Integer> dataTreeMap = new TreeMap<>();

		for (int index = 0; index < count; index++) {

			System.out.println("Enter the key elemet :");
			String key = oScanner.next();
			System.out.println("Enter the value element :");
			Integer value = oScanner.nextInt();
			dataTreeMap.put(key, value);

		}
		System.out.println(dataTreeMap);
		System.out.println("Iterating TreeMap ");
		for (Map.Entry insertion : dataTreeMap.entrySet()) {
			System.out.println("Key " + insertion.getKey() + " ,Value " + insertion.getValue());
		}

		// reverse
		NavigableMap<String, Integer> reverseMap = dataTreeMap.descendingMap();
		System.out.println("Reverse Order :" + reverseMap);
	}
}
