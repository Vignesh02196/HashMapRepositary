package com.onesoft.day3_Objectclass;

public class Usecar {
	public static void main(String []args) 
	{
	Car c=new Car();
	c.brand="Skoda";
	c.Color="Red";
	c.fuel="petrol";
	c.price=1250000;
	c.mileage=10.00f;
	c.Seat=4;
	c.usage="tour";
	System.out.println("\n Brand="+c.brand + "\n Color="+c.Color +"\n Fuel= "+c.fuel+"\n Price="+c.price+"\n Seat="+c.Seat+" \n usage="+c.usage +"\n mileage=" +c.mileage);
	Car c1=new Car();
	c1.brand="tavera";
	c1.Color="White";
	c1.fuel="Diesel";
	c1.price=1000000;
	c1.mileage=12.00f;
	c1.Seat=7;
	c1.usage="family";
	System.out.println("\n Brand="+c1.brand + " \n Color="+c1.Color +"\n Fuel= "+c1.fuel+"\n Price="+c1.price+" Seat="+c1.Seat+" \n usage="+c1.usage+"\n mileage=" +c1.mileage);
	}

}
