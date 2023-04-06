package com.onesoft.day8_fortemp;

public class Lastletter {
	public static void main(String [] args)
	{
		String [] names= { "Siva","raghu","Santhosh","sathish"};
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i].charAt((names.length-1)));
		}
	}

}
 