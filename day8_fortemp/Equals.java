package com.onesoft.day8_fortemp;

public class Equals {
	public static void main(String [] args)
	{
		String [] brands= { "AUDI","TATA","jaquar","lamborgini"};
		//boolean isAudi="";
		for(int i=0;i<brands.length;i++)
		{
		System.out.println(brands[i].equalsIgnoreCase("audi"));
	}
	}

}
