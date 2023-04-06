package com.onesoft.day13_interface;

public class Teacher implements Employee {
	
	public String name(String name) {
		return name;
	}
	public String id(int id) {
		
		if(id%2==0) {
		return "The id is even";
		}
		else
		{
			return "The id is odd";
		}
		
	}
	public boolean isMale(boolean isMale) {
		return isMale;
	}

}
