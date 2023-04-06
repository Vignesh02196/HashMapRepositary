package com.onesoft.day7_for1;

public class Positive {
	public static void main(String[] args)
	{
		int count=0;
		for (int i=-25;i<=25;i++)
		{
			if(i>0)
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Count="+count);
	}
	

}
