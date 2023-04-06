package com.onesoft.day18_Java8featurs;

public class UseCalculator {
	public static void main(String args[]) {
		Calculator add=(a,b)->a+b;
		System.out.println(add.math(10,20));
		Calculator sub=(a,b)->a-b;
		System.out.println(sub.math(10,20));
	}

}
