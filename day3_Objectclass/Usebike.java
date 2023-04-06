package com.onesoft.day3_Objectclass;

public class Usebike {
	public static void main(String [] args) 
	{
	Bike s=new Bike();
	s.brand="R15";
	s.price=200000;
	s.discountamount=2000;
	s.netprice=s.price-s.discountamount;
	System.out.println("\n Brand="+s.brand +"\n netprice="+s.netprice);
	
	Shirt s1=new Shirt();
	s1.brand="Royal Enfield";
	s1.price=250000;
	s1.discountpercentage=7f;
	s1.netprice=s1.price-(s1.price*7/100);
	System.out.println("\n Brand="+s1.brand +"\n netprice="+s1.netprice);
	}
}
