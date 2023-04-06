package com.onesoft.day4_Stringfunctions;

public class Boolean {
	public static void main(String []args) {
		String a="Balaviki";
		boolean result=a.contains("vk");
		boolean result1=a.startsWith("Bala");
		boolean result2=a.endsWith("la");
		boolean result3=a.equals("BaLaviki");
		boolean result4=a.equalsIgnoreCase("balviki");
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);	
	}
	
}
