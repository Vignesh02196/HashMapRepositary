package com.onesoft.day18_Java8featurs;

public class Pallavan implements Train {
	
	public String name(String name) {
		return name;
	}
	public  int SeatNo(int seatno) {
		return seatno*7;
	}
	public  String ticketprice(int price) {
		if(price>300) {
			return "AC Coach";
		}
		else if(price<=200) {
			return "Sleeper Coach";
		}
		else
		{
			return "Normal Coach";
		}
	}

}
