package com.onesoft.day8_fortemp;

public class Vowels {
	public static void main(String [] args)
	{
		String [] names= { "siva","rgh","Santhosh","sathish"};
		//String temp="";
		for(int i=0;i<names.length;i++)
		{
			if(names[i].contains("a")||names[i].contains("e")||names[i].contains("i")||names[i].contains("o")||names[i].contains("u"))
			{	
			
			System.out.println(names[i]);
		}
		
		}
	}

}
