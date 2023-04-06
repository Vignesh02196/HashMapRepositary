package com.onesoft.day18_Java8featurs;

public interface Employee {
	public void name(String name);
	public void id(int id);
	public void salary(int salary);
	public void geneder(String gender);
	public static void workinghour(int hour) {
		System.out.println(hour);
	}

}
