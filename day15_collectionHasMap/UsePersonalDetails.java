package com.onesoft.day15_collectionHasMap;
import java.util.HashMap;
public class UsePersonalDetails {
	public static void main(String [] args) {
		PersonalDetails p1=new PersonalDetails("Viki",25,"Male",6363636366l,9629493173l);
		PersonalDetails p2=new PersonalDetails("Singh",25,"Male",6366969696l,96294898989l);
		PersonalDetails p3=new PersonalDetails("Vji",25,"female",7373733737l,96969696963l);
		PersonalDetails p4=new PersonalDetails("karthick",25,"Male",699696669l,92525252525l);
		PersonalDetails p5=new PersonalDetails("Kavya",25,"female",969696963636l,8585858585858l);
		PersonalDetails p6=new PersonalDetails("Karan",25,"Male",696969696l,9969696969l);
		PersonalDetails p7=new PersonalDetails("Siva",25,"Male",8989898989898l,8989898989l);
		HashMap<Long,PersonalDetails> pd=new HashMap<>();
		pd.put(p1.getAdharno(),p1);
		pd.put(p2.getAdharno(), p2);
		pd.put(p3.getAdharno(), p3);
		pd.put(p4.getAdharno(), p4);
		pd.put(p5.getAdharno(),p5);
		pd.put(p6.getAdharno(),p6);
		pd.put(p7.getAdharno(),p7);
		//System.out.println(pd);
		//System.out.println(pd.keySet());
		System.out.println(pd.values());
	}

}
