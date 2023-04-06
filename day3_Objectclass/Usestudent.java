package com.onesoft.day3_Objectclass;

public class Usestudent {
	public static void main(String [] args) {
		Student s=new Student();
		s.Name="Viki";
		s.id=123;
		s.age=23;
		s.section='B';
		s.attendancepercentage=95.00f;
		s.totalworkingdays=240;
		System.out.println("\n No of total working days="+s.totalworkingdays+"\n Attendance percentage="+s.attendancepercentage+"\n No of Present days="+(s.totalworkingdays*s.attendancepercentage/100));
		
	}

}
