package com.onesoft.day18_Java8featurs;

public interface Electronics {
	public int ResaleAmount(int price);
	public default  String onOff(boolean isOn) {
		if(isOn==true)
		{
			return "product is working";
			
		}
		else
		{
			return "product is not working";
		}
	}

}
