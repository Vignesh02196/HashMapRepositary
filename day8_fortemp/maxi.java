package com.onesoft.day8_fortemp;

public class maxi {
	public static void main(String [] args)
	{
		int [] values= {10,20,30,40};
		int max=0;
		for(int i=0;i<values.length;i++)
		{
			if(values[i]>max)
			{
				max=values[i];
			}
		}
		System.out.println(max);
	}

}
