package com.onesoft.day3_Objectclass;

public class Usebriyani {
	public static void main(String [] args) {
		Briyani b=new Briyani();
		b.variety="Chicken";
		b.price=250;
		b.quantity=1.50f;
		b.Brand="kfg";
		//System.out.println("\n Variety= "+b.variety +"\n Price="+b.price+"\n Quantity="+b.quantity+"\n Brand="+b.Brand );
		
		Briyani b1=new Briyani();
		b1.variety="mutton";
		b1.price=300;
		b1.quantity=1.00f;
		b1.Brand="thalapakatti";
		//System.out.println("\n Variety= "+b1.variety +"\n Price="+b1.price+"\n Quantity="+b1.quantity+"\n Brand="+b1.Brand );
	
		Briyani b2=new Briyani();
		b2.variety="beef";
		b2.price=100;
		b2.quantity=1.00f;
		b2.Brand="kerala";
		//System.out.println("\n Variety= "+b2.variety +"\n Price="+b2.price+"\n Quantity="+b2.quantity+"\n Brand="+b2.Brand );
	
		System.out.println(b+"\n"+b1+"\n"+b2);
	}

}
