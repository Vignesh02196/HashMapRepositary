package com.onesoft.day8_fortemp;

public class Str {
	public static void main(String [] args)
	{
		String [] names= { "Siva","raghu","Santhosh","sathish"};
		int max=names[0].length();
		String tem="";
		for(int i= 0;i<names.length;i++)
		{
			if(names[i].length()<=max)
			{
				max=names[i].length();
				tem=names[i];
			}
			
		}
		System.out.println(tem);
	}

}
