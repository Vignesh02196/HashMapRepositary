package com.onesoft.day7_for1;

public class Even1 {
	public static void main(String [] args)
	{
		int count=0;
		for(int i=0;i<=50;i++)
		{
			if(i%2==0)
			{
				count ++;
				System.out.println(i);
			}
		}
		System.out.println("Count="+count);
	}
}
