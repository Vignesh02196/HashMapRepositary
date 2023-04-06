package com.onesoft.day3_Objectclass;

public class UseEmployee {
 public static void main(String [] args) {
	 Employee e=new Employee();
	 e.employeeid=111;
	 e.employeename="dinesh";
	 e.dateofbirth="21-04-1996";
	 e.mobileno=9629493173l;
	 e.countycode="+91";
	 System.out.println("Employee mobile no ="+(e.countycode+e.mobileno));
	 Employee e1=new Employee();
	 e1.employeeid=112;
	 e1.employeename="rinesh";
	 e1.dateofbirth="23-04-1996";
	 e1.mobileno=9729493173l;
	 e1.countycode="+91";
	 System.out.println("Employee mobile no ="+(e1.countycode+e1.mobileno));

 }
}
