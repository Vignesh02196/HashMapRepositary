package com.onesoft.day5_LMS;

public class Commaseparator {
	public static void main(String[] args)
	{
	String []a=args[0].split(",");	
	int number1=Integer.parseInt(a[0]);
	int number2=Integer.parseInt(a[1]);
	String []b=args[0].split(",");	
	int number3=Integer.parseInt(b[0]);
	int number4=Integer.parseInt(b[1]);
	System.out.println((number1+number2)*(number3+number4));
	}
}
