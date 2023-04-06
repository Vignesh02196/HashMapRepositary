package com.onesoft.day3_Objectclass;

public class Useshirt {
	public static void main(String [] args) 
	{
	Shirt s=new Shirt();
	s.brand="US POLO";
	s.price=2000;
	s.discountamount=200;
	s.netprice=s.price-s.discountamount;
	System.out.println("\n Brand="+s.brand +"\n netprice="+s.netprice);
	
	Shirt s1=new Shirt();
	s1.brand="Peter England";
	s1.price=2000;
	s1.discountpercentage=10f;
	s1.netprice=s1.price-(s1.price*10/100);
	System.out.println("\n Brand="+s1.brand +"\n netprice="+s1.netprice);
	
	}

}
