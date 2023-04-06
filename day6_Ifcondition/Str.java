package com.onesoft.day6_Ifcondition;

public class Str {
	public static void main(String [] args) 
	{
		 int a=40;
		 int b=40;
		 int c=40;
		 if (a<b&a<c)
		 {
			 System.out.println(a+"is lessor");
			 
		 }
		 else if (b<a&b<c)
		 {
			 System.out.println(b+"is lessor");
			 
		 }
		 else if (c<b&c<a)
		 {
			 System.out.println(c+"is lessor");
			 
		 }
		 else 
		 {
			 System.out.println("all are equal");
		 }
}
}