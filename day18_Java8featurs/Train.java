package com.onesoft.day18_Java8featurs;
@FunctionalInterface
public interface Train {
	
	public String name(String name);
	public static int SeatNo(int seatno) {
		return seatno;
	}
	public default String ticketprice(int price) {
		if(price>500) {
			return "AC Coach";
		}
		else if(price<=400) {
			return "Sleeper Coach";
		}
		else
		{
			return "Normal Coach";
		}
	}
	

}
