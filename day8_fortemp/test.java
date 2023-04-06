package com.onesoft.day8_fortemp;

public class test {
	public static void main(String[]args)
	{
		String []names= {"EAT","xyz","BCD","apples"};
		//String tem="";
		for(int i=0;i<names.length;i++)
		{
			if(names[i].contains("a")||names[i].contains("e")||names[i].contains("o")||names[i].contains("i")||names[i].contains("u")||names[i].contains("A")||names[i].contains("E")||names[i].contains("O")||names[i].contains("I")||names[i].contains("U")) 
			{
				System.out.println(names[i]);
				
			}
		}
	}
}
