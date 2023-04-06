package com.onesoft.day16_collectionStream;
import java.util.*;
import java.util.stream.Collectors;
public class UseStudent {
	public static void main(String args[]) {
		Student s1=new Student("VIKI",1101,'C',58,true,"B+");
		Student s2=new Student("parathap",1102,'B',80,true,"A+");
		Student s3=new Student("Karthik",1099,'C',90,false,"o+");
		Student s4=new Student("NiSHA",508,'B',95,false,"A1+");
		ArrayList<Student>std=new ArrayList<>();
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
//Entire List
/*std.stream().forEach(x->System.out.println(x));
List <Student>a=std.stream().collect(Collectors.toList());
a.forEach(y->System.out.print(y));*/
//Only Filter
/*std.stream().filter(z->z.getBloodGroup().equals("B+")).forEach(z->System.out.println(z));
List <Student>b=std.stream().filter(z->z.getBloodGroup().equals("B+")).collect(Collectors.toList());
b.forEach(k->System.out.println(k));*/

//Only Map and print

/*std.stream().map(h->h.isPreset()).forEach(h1->System.out.println(h1));*/

// filter & Map & collection & print:
			/*std.stream().filter(h3->h3.getRollno()>15).map(h4->h4.getName()).forEach(h5->System.out.println(h5));
			List<String>c1=std.stream().filter(h6->h6.getRollno()>15).map(h4->h4.getName()).collect(Collectors.toList());*/
// Map & Filter &collection & print:
		/*std.stream().map(z1->z1.getAvg()).filter(z2->z2>=80).forEach(z3->System.out.println(z3));
		List<Integer>c2=std.stream().map(z1->z1.getAvg()).filter(z2->z2>80).collect(Collectors.toList());

		c2.forEach(z4->System.out.println(z4));*/
// Map & Filter &count:
		
		long e1=std.stream().filter(x->x.getName().startsWith("V")).count();
		System.out.println(e1);
	}

}
