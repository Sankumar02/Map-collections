package com.Task_05_05_22;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

	public static void main(String[] args)

	{
		Map<Integer, Double> methodsMap = new HashMap<>();
		methodsMap.put(100, 1.5);
		methodsMap.put(101, 2.5);

		System.out.println("Entries : " + methodsMap);

		Map<Integer, Double> putallmethodsMap = new HashMap<>();
		putallmethodsMap.putAll(methodsMap);
		putallmethodsMap.putIfAbsent(102, 3.5);
		System.out.println("Put all method :" + putallmethodsMap);

		System.out.println("Remove: " + methodsMap.remove(104));

		System.out.println("Replace :" + methodsMap.replace(101, 9.5));
		System.out.println("After replace : " + methodsMap);

		System.out.println("Replace 2: " + methodsMap.replace(100, 1.5, 4.5));
		System.out.println("after replace : " + methodsMap);

		System.out.println("Key Set: " + putallmethodsMap.keySet());

		try {
			System.out.println("Compute :" + methodsMap.compute(100, (key, val) -> (val == null) ? 3 : val + 3));
			System.out.println("After compute :" + methodsMap);
		} catch (NullPointerException e) {
			System.out.println("enter the valid input");
			System.exit(0);
		}

		System.out.println("ComputeIfAbsent :" + putallmethodsMap.computeIfAbsent(105, k -> 22.5));
		System.out.println("Entry after compute :" + putallmethodsMap);

		System.out.println("Contains Key: " + methodsMap.containsKey(100));

		System.out.println("Contains Value: " + methodsMap.containsValue(2.5));

		System.out.println("Isempty: " + putallmethodsMap.isEmpty());

//		Double merge = methodsMap.merge(101, 2.5, (oldValue, newValue) -> oldValue + newValue);
//		System.out.println("MethodMerge: " + merge);

		System.out.println("Size: " + methodsMap.size());
	}
}
