package com.onesoft.day8_fortemp;

public class Min {
	public static void main(String [] args)
	{
		int [] values= {10,20,30,40};
		int min=values[0];
		for(int i=0;i<values.length;i++)
		{
			if(values[i]<min)
			{
				min=values[i];
			}
		}
		System.out.println(min);
	}

}
