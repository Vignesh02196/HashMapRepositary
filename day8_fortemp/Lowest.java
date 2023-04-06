package com.onesoft.day8_fortemp;

public class Lowest {
	public static void main(String[]args)
	{
		String [] names= { "Siva","raghu","Santhosh","sathish"};
		int min=names[0].length();
		String temp="";
		for(int i=0;i<names.length;i++)
		{
			if(names[i].length()<=min)
			{
				min=names[i].length();
				temp=names[i];
				//System.out.println(i);
			}
			
		}
		System.out.println(temp);
	}

}
