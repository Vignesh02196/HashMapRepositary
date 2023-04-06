package com.onesoft.day6_Ifcondition;

public class Home {
	public static void main(String[] args) {
		String a = args[0];
		//char b = a.charAt(0);
		if (a.charAt(0) == 'N') {
			System.out.println("NORTH");
		} else if (a.charAt(0)== 'S') {
			System.out.println("SOUTH");
		} else if (a.charAt(0) == 'E') {
			System.out.println("EAST");
		} else {
			System.out.println("WEST");
		}
	}

}
