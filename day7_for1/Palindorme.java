package com.onesoft.day7_for1;

public class Palindorme {
	public static void main(String [] args)
	{
		String a="aam";
		String tem="";
		for (int i=a.length()-1;i>=0;i--)
		{
			tem=tem+a.charAt(i);
		}
		if(a.equalsIgnoreCase(tem))
		{
			System.out.println("The String is Palindrome");
		}
		else
		{
			System.out.println("The given String is not a Palindrome");
		}
	}
	

}
