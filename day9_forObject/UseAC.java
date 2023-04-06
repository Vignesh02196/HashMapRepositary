package com.onesoft.day9_forObject;

public class UseAC {
	public static void main(String[] args) {
		AC ac1 = new AC();
		ac1.brand = "VOLTAS";
		ac1.price = 25000;
		ac1.star = 4;
		ac1.ton = 2;

		AC ac2 = new AC();
		ac2.brand = "TATA";
		ac2.price = 35000;
		ac2.star = 5;
		ac2.ton = 4;

		AC ac3 = new AC();
		ac3.brand = "PHILIPS";
		ac3.price = 23000;
		ac3.star = 3;
		ac3.ton = 3;

		AC ac4 = new AC();
		ac4.brand = "WHIRLPOOL";
		ac4.price = 26000;
		ac4.star = 5;
		ac4.ton = 2;

		AC ac5 = new AC();
		ac5.brand = "BLUE STAR";
		ac5.price = 35000;
		ac5.star = 4;
		ac5.ton = 3;

		AC ac6 = new AC();
		ac6.brand = "CARRIER";
		ac6.price = 17000;
		ac6.star = 4;
		ac6.ton = 5;

		AC ac7 = new AC();
		ac7.brand = "DAIKIN";
		ac7.price = 16000;
		ac7.star = 4;
		ac7.ton = 3;

		AC ac8 = new AC();
		ac8.brand = "HITACHI";
		ac8.price = 17000;
		ac8.star = 4;
		ac8.ton = 6;

		AC ac9 = new AC();
		ac9.brand = "INDEX";
		ac9.price = 27000;
		ac9.star = 4;
		ac9.ton = 5;

		AC[] ac = { ac1, ac2, ac3, ac4, ac5, ac6, ac7, ac8, ac9 };
		
		AC str = ac[0];
		int tn = 0;
		int count = 0;
		for (int i = 0; i < ac.length; i++) {
			if (ac[i].star== 3) {

				System.out.println(ac[i].brand);
			}
		} 

		for (int i = 0; i < ac.length; i++) {
			if (ac[i].price > 30000) {
				count++;
			}
		}
		System.out.println(count); 

		for (int i = 0; i < ac.length; i++) {
			if (ac[i].ton== 2) {
				tn = ac[i].price + tn;
			}
		}
             System.out.println(tn);
             
		 for (int i = 0; i < ac.length; i++) {
			if (ac[i].brand.equals("VOLTAS")) {
				
		
			System.out.println(ac[i].price-500);
			}
			
		}
		
		for(AC c:ac)
		{

	}

	}
}
