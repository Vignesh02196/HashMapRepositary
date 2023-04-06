package com.onesoft.day6_Ifcondition;

public class UseAirconditioner {
	public static void main(String[] args) {
		Airconditioner air = new Airconditioner();
		air.Brand = "Whirpool";
		air.price = 22000;
		Airconditioner air1 = new Airconditioner();
		air1.Brand = "TATA";
		air1.price = 25000;
		if (air.price > air1.price) {
			System.out.println(air.Brand);
		} else {
			System.out.println(air1.Brand);
		}
	}
}
