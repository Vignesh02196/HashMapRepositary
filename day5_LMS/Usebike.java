package com.onesoft.day5_LMS;

public class Usebike {
	public static void main(String []args) {
		Bike b=new Bike();
		b.brand=args[0];
		b.price=Integer.parseInt(args[1]);
		b.color=args[2];
		Bike b1=new Bike();
		b1.brand=args[3];
		b1.price=Integer.parseInt(args[4]);
		b1.color=args[5];
		System.out.println("Brand:"+b.brand+"\n Price:"+b.price+"\n color:"+b.color);
		System.out.println("Brand:"+b1.brand+"\n Price:"+b1.price+"\n color:"+b1.color);
	}

}
class Bike {
	String brand;
	int price;
	String color;
	
}
