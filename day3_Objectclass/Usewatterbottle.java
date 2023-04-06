package com.onesoft.day3_Objectclass;

public class Usewatterbottle 
{
public static void main(String []args) 
{
	Waterbottle V=new Waterbottle();
	V.color="brown";
	V.price=75;
	V.material="copper";
	V.size=1f;
	V.brand="orion";
	System.out.println(V.color+ " " +V.price +"  "+V.material+"  "+V.size+ "   "+ V.brand);
}

}
