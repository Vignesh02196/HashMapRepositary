package com.onesoft.day7_for1;

public class Prime {
	public static void main(String []args)
	{
	int num=11;
	boolean isPrime=true;
	for (int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			isPrime=false;
		}
	}
	if (isPrime==true)
	{
		System.out.println("it is prime");
	}
	else
	{
		System.out.println("it is not a prime");
	}
	}

}
