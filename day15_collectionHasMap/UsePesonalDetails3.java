package com.onesoft.day15_collectionHasMap;

import java.util.HashMap;

public class UsePesonalDetails3 {
	public static void main(String [] args) {
		PersonalDetails3 p1=new PersonalDetails3("Viki",25,"Male",6363636366l,9629493173l);
		PersonalDetails3 p2=new PersonalDetails3("Singh",25,"Male",6366969696l,96294898989l);
		PersonalDetails3 p3=new PersonalDetails3("Vji",25,"female",7373733737l,96969696963l);
		PersonalDetails3 p4=new PersonalDetails3("karthick",25,"Male",699696669l,92525252525l);
		PersonalDetails3 p5=new PersonalDetails3("Kavya",25,"female",969696963636l,8585858585858l);
		PersonalDetails3 p6=new PersonalDetails3("Karan",25,"Male",696969696l,9969696969l);
		PersonalDetails3 p7=new PersonalDetails3("Sv",25,"Male",8989898989898l,8989898989l);
		HashMap<Long,PersonalDetails3> pd=new HashMap<>();
		pd.put(p1.getAdharno(),p1);
		pd.put(p2.getAdharno(), p2);
		pd.put(p3.getAdharno(), p3);
		pd.put(p4.getAdharno(), p4);
		pd.put(p5.getAdharno(),p5);
		pd.put(p6.getAdharno(),p6);
		pd.put(p7.getAdharno(),p7);
		pd.values().forEach(x->{
			if(x.getName().contains("a")||x.getName().contains("e")||x.getName().contains("i")||x.getName().contains("u")||x.getName().contains("o"))
			{
				System.out.println("It contains Vowels");
			}
			else
			{
				System.out.println("NOT contains Vowels");
			}
			
		});
	}

}
