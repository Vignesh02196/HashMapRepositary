package com.onesoft.day5_LMS;

public class PersonDetails {
	public static void main(String[] args)
	{
		String name=args[0];
		int id=Integer.parseInt(args[1]);
		char initial=args[2].charAt(0);
		boolean ispresent=Boolean.parseBoolean(args[3]);
		System.out.println(name+"  "+id+"  "+initial+"  "+ispresent);
	}

}
