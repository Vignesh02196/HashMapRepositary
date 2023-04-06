package com.onesoft.day4_Stringfunctions;

public class SeparateWordSplit {
	public static void main(String[]args)
	{
	String word="Hello world";
	String[]letters=word.split("o");
	System.out.println(letters[0]);
	System.out.println(letters[1]);
	System.out.println(letters[2]);
	//System.out.println(letters[3]);
	}
}
