package com.onesoft.day15_collectionHasMap;

import java.util.*;
public class UsePersonalDetails4 {
	public static void main(String [] args) {
		PersonalDetails4 p1=new PersonalDetails4("Viki",25,"Male",6363636366l,9629493173l);
		PersonalDetails4 p2=new PersonalDetails4("Singh",25,"Male",6366969696l,96294898989l);
		PersonalDetails4 p3=new PersonalDetails4("Vji",25,"female",7373733737l,96969696963l);
		PersonalDetails4 p4=new PersonalDetails4("karthick",25,"Male",699696669l,92525252525l);
		PersonalDetails4 p5=new PersonalDetails4("Kavya",25,"female",969696963636l,8585858585858l);
		PersonalDetails4 p6=new PersonalDetails4("Karan",25,"Male",696969696l,9969696969l);
		PersonalDetails4 p7=new PersonalDetails4("Siva",25,"Male",8989898989898l,8989898989l);
		HashMap<Long,PersonalDetails4> pd=new HashMap<>();
		pd.put(p1.getAdharno(),p1);
		pd.put(p2.getAdharno(), p2);
		pd.put(p3.getAdharno(), p3);
		pd.put(p4.getAdharno(), p4);
		pd.put(p5.getAdharno(),p5);
		pd.put(p6.getAdharno(),p6);
		pd.put(p7.getAdharno(),p7);
		Iterator <Long>it=pd.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
