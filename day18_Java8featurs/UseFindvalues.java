package com.onesoft.day18_Java8featurs;

public class UseFindvalues {
	public static void main(String [] args) {
		Method m=new Method();
		FindValues maxi=m::findMax;
		int []a= {12,16,18,20,23,5};
		maxi.findArray(a);
		FindValues mini=m::findMin;
		mini.findArray(a);
	}

}
