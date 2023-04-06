package com.onesoft.day15_collectionHasMap;

import java.util.HashMap;

public class Lms3 {
	public static void main(String args[]) {
		HashMap<Integer,String>lms=new HashMap<>();
		lms.put(508, "VIJI");
		lms.put(1101, "Vignesh");
		lms.put(1102, "Singh");
		lms.put(1099, "Karthick");
		lms.put(508, "Surya");
		System.out.println(lms.values());
	}

}
