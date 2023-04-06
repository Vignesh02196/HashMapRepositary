package com.onesoft.day8_fortemp;

public class Highest {
	public static void main(String [] args)
	{
		String [] names= { "Siva","raghu","Santhosh","sathish"};
		int max=names[0].length();
		for(int i= 0;i<names.length;i++)
		{
			if(names[i].length()>=max)
			{
				max=names[i].length();
			}
			
		}
		System.out.println(max);
	}

}
