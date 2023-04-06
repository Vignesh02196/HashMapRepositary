package com.onesoft.day13_interface;

public class StoryBook implements Book {
	
	public void brand(String brand) {
	System.out.println(brand);	
	}
	public void edition(int e) {
	if(e==2020)
	{
		System.out.println("NEW Edition");
	}
	else if(e>=2016)
	{
		System.out.println("OLD Edition");
	}
	else
	{
		System.out.println("INVALID");
	}
	}

}
