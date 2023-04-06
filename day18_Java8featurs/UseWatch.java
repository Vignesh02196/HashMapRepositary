package com.onesoft.day18_Java8featurs;

public class UseWatch {
	public static void main(String args[]) {
     
		Watch smart=x->{if(x<1200) {
			return "Smart Watch";
		}
		else
		{
			return "Normal Watch";
		}
		};
		System.out.println(smart.findprice(1500));
	}
}
