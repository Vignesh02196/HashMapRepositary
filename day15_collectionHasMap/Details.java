package com.onesoft.day15_collectionHasMap;

import java.util.HashMap;

public class Details {
	
	public static void main(String args[]) {
		
			PersonalDetails1 p1=new PersonalDetails1("Viki",25,"Male",6363636366l,9629493173l);
			PersonalDetails1 p2=new PersonalDetails1("Singh",25,"Male",6366969696l,96294898989l);
			PersonalDetails1 p3=new PersonalDetails1("Vji",25,"female",7373733737l,96969696963l);
			PersonalDetails1 p4=new PersonalDetails1("karthick",25,"Male",699696669l,92525252525l);
			PersonalDetails1 p5=new PersonalDetails1("Kavya",25,"female",969696963636l,8585858585858l);
			PersonalDetails1 p6=new PersonalDetails1("Karan",25,"Male",696969696l,9969696969l);
			PersonalDetails1 p7=new PersonalDetails1("Siva",17,"Male",8989898989898l,8989898989l);
			
			HashMap<Long,PersonalDetails1> pd=new HashMap<>();
			pd.put(p1.getAdharno(),p1);
			pd.put(p2.getAdharno(),p2);
			pd.put(p3.getAdharno(),p3);
			pd.put(p4.getAdharno(),p4);
			pd.put(p5.getAdharno(),p5);
			pd.put(p6.getAdharno(),p6);
			pd.put(p7.getAdharno(),p7);
		for(PersonalDetails1 x:pd.values()) {
			if(x.getAge()>18) {
				System.out.println("ELIGIBLE FOR VOTE");
			}
			else
			{
				System.out.println("NOTELIGIBLE FOR VOTE");
			}
			
			
		
		
		}
	}
}

