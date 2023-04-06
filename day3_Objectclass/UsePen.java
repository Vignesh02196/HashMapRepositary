package com.onesoft.day3_Objectclass;

public class UsePen {
	public static void main(String [] args)
	{
	Pen p=new Pen();
	p.Color="red";
	p.price=100;
	p.brand="hero";
	p.isint=true;
	p.lidwidth=0.5f;	
	Pen p1=new Pen();
	p1.price=200;
	Pen p2=new Pen();
	p2.price=300;
	System.out.println("the average is="+(p.price+p1.price+p2.price)/3);
	}
}
