package com.onesoft.day13_interface;

public class UseOnlineCourse {
	public static void main(String args[]) {
		OnlineCourse o=new OnlineCourse();
		System.out.println(o.courseTrainername("NISHA"));
		System.out.println(o.coursehours(2));
		System.out.println(o.courseOnline(false));
		System.out.println(o.courseLink("JAVA T POINT"));
		System.out.println(o.courseFee("PYTHON"));
	}

}
