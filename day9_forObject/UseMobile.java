package com.onesoft.day9_forObject;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand = "SAMSUNG";
		m1.price = 26000;
		m1.color = "BLACK";
		m1.is5G = true;

		Mobile m2 = new Mobile();
		m2.brand = "OPPO";
		m2.price = 20000;
		m2.color = "SILVER";
		m2.is5G = false;

		Mobile m3 = new Mobile();
		m3.brand = "VIVO";
		m3.price = 18000;
		m3.color = "GREY";
		m3.is5G = true;

		Mobile m4 = new Mobile();
		m4.brand = "HONOR";
		m4.price = 10000;
		m4.color = "SILVERWHITE";
		m4.is5G = false;

		Mobile m5 = new Mobile();
		m5.brand = "MOTO";
		m5.price = 12000;
		m5.color = "BLACK";
		m5.is5G = true;

		Mobile m6 = new Mobile();
		m6.brand = "NOKIA";
		m6.price = 10000;
		m6.color = "RED";
		m6.is5G = false;
		Mobile[] mobile1 = { m1, m2, m3, m4, m5, m6 };

		Mobile temp = mobile1[0];

		for (int i = 0; i < mobile1.length; i++) {
			// if(mobile1[i].price>25000)
			// {
			// System.out.println(mobile1[i].brand);
			// }

			if (mobile1[i].price > temp.price) {
				temp = mobile1[i];
			}

		}
		System.out.println(temp.brand + "," + temp.price);
	}
}
