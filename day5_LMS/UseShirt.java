package com.onesoft.day5_LMS;

public class UseShirt {
	public static void main(String []args) {
		String[]a=args[0].split(",");
		Shirt b=new Shirt ();
		b.Brand=a[0];
		b.price=Integer.parseInt(a[1]);
		b.size=Integer.parseInt(a[2]);
		b.ischecked=Boolean.parseBoolean(a[3]);
		b.discount=Integer.parseInt(a[4]);
		System.out.println(" Brand="+b.Brand+"\n Size:"+b.size+"\n Netprice="+(b.price-(b.price*b.discount/100)));
	}
}

	class Shirt {
		String Brand;
		int price;
		int size;
		boolean ischecked;
		int discount;
		
	}
