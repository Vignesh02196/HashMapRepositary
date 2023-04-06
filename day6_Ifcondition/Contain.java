package com.onesoft.day6_Ifcondition;

public class Contain {
	public static void main(String[] args) {
		String val = "sng";
		if (val.contains("a") || val.contains("e") || val.contains("i") || val.contains("o") || val.contains("u"))

		{
			System.out.println("the word contain vowels");
		}

		else {
			System.out.println("the word not contains vowels");
		}
	}
}
