
package com.onesoft.day18_Java8featurs;

public class UsePositive {
	public static void main(String args[]) {
		Positive num = b-> {
			for (int i = 0; i < b.length; i++) {
				if (b[i] < 0) {

					System.out.println(b[i]);
				}

			}

		};
		int a[] = { -10, -8, -6, 8, 7 };
		num.findPositive(a);
	}

}
