package com.onesoft.day4_Stringfunctions;

public class Test1 {
	public static void main(String[]args)
	{
	String firstname="Ram";
	String lastname="Kumar";
    String fullname=firstname.concat(lastname);
    String uppercase=fullname.toUpperCase();
    int lenght=fullname.length();
    System.out.println(fullname);
    System.out.println(uppercase);
    System.out.println(lenght);
	}
}
