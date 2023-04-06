package com.onesoft.day9_forObject;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brand = "AUDI";
		c1.price = 5000000;
		c1.model = "XII";
		c1.mileage = 10;

		Car c2 = new Car();
		c2.brand = "TATA";
		c2.price = 1000000;
		c2.model = "INDICA";
		c2.mileage = 12;

		Car c3 = new Car();
		c3.brand = "NISSIAN";
		c3.price = 150000;
		c3.model = "BOULT";
		c3.mileage = 10;

		Car c4 = new Car();
		c4.brand = "LAMBOGINI";
		c4.price = 10000000;
		c4.model = "RACE";
		c4.mileage = 9;

		Car[] cars = { c1, c2, c3, c4 };
		Car temp = cars[0];
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].price < temp.price) {
				temp = cars[i];
			}
		}
		System.out.println(temp.brand + "," + temp.price);

		Car mil = cars[0];

		for (int i = 0; i < cars.length; i++) {
			if (cars[i].mileage > mil.mileage) {

				mil = cars[i];
			}
		}
		System.out.println(mil.brand + "," + mil.mileage);
		Car pri = cars[0];
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].price < pri.price) {
				pri = cars[i];
			}
		}
		System.out.println(pri.brand + "," + pri.price);

		Car len = cars[0];
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].brand.length() < len.brand.length()) {
				len = cars[i];
			}
		}

		System.out.println(len.brand);

		for (Car c : cars) {

		}
	}
}
