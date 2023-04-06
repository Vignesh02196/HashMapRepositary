package com.onesoft.day3_Objectclass;

public class UseAccountholder {
	public static void main(String []args) {
		Accountholder a=new Accountholder();
		a.Name="viki";
		a.age=23;
		a.gender="male";
		a.accountno=233263252596l;
		a.income=25000;
		a.savingpercentage=10.00f;
		System.out.println("\n Monthly income="+a.income+"\n Savings percentage="+a.savingpercentage+"\n Savings amount="+(a.income*a.savingpercentage/100));
	}

}
