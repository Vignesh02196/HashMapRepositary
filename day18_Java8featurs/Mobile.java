package com.onesoft.day18_Java8featurs;

public class Mobile implements Electronics {
	public int ResaleAmount(int price) {
		return price/1;
	}
	public String onOff(boolean isOn) {
		if(isOn!=true)
		{
			return "working";
			
		}
		else
		{
			return "Display Gone";
		}
	}

}
