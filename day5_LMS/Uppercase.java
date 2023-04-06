package com.onesoft.day5_LMS;

public class Uppercase {
	public static void main(String []args)
	{
		String []a=args[0].split(",");
		String b=a[0].toUpperCase();
		System.out.println(b+"  "+a[1]);	
	}
}
