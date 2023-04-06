package com.onesoft.day18_Java8featurs;

import com.onesoft.day2_Datatype2.Mul;

public class UseCal1 {
	public static void main(String args[]) {
	Cal1 mul=(a,b)->System.out.println(a*b);
	mul.math(10,10);
	Cal1 div=(a,b)->System.out.println(a/b);
	div.math(10, 5);
}
}