
package com.onesoft.day15_collectionHasMap;

import java.util.*;


public class UsePesonalDetails6 {
	public static void main(String [] args) {
		PersonalDetails6 p1=new PersonalDetails6("Viki",25,"Male",6363636366l,9629493173l);
		PersonalDetails6 p2=new PersonalDetails6("Singh",25,"Male",6366969696l,96294898989l);
		PersonalDetails6 p3=new PersonalDetails6("Vji",25,"female",7373733737l,96969696963l);
		PersonalDetails6 p4=new PersonalDetails6("karthick",25,"Male",699696669l,92525252525l);
		PersonalDetails6 p5=new PersonalDetails6("Kavya",25,"female",969696963636l,8585858585858l);
		PersonalDetails6 p6=new PersonalDetails6("Karan",25,"Male",696969696l,9969696969l);
		PersonalDetails6 p7=new PersonalDetails6("Siva",25,"Male",8989898989898l,8989898989l);
		HashMap<Long,PersonalDetails6> pd=new HashMap<>();
		pd.put(p1.getAdharno(),p1);
		pd.put(p2.getAdharno(), p2);
		pd.put(p3.getAdharno(), p3);
		pd.put(p4.getAdharno(), p4);
		pd.put(p5.getAdharno(),p5);
		pd.put(p6.getAdharno(),p6);
		pd.put(p7.getAdharno(),p7);
		Iterator <PersonalDetails6>it=pd.values().iterator();
		while(it.hasNext()) {
			if(it.next().getAdharno()%2!=0) {
				it.remove();
			}
		}
		pd.forEach((x,y)->System.out.println(y));
	}

}
