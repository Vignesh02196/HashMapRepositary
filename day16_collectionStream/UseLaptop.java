package com.onesoft.day16_collectionStream;
import java.util.*;
import java.util.stream.Collectors;

public class UseLaptop {
public static void main(String args[]) {
	Laptop l1=new Laptop("HP",950000,"i7",true,"Black");
	Laptop l2=new Laptop("DELL",70000,"i5",false,"Blue");
	Laptop l3=new Laptop("DELL",65000,"i5",true,"silver");
	Laptop l4=new Laptop("MAC",150000,"i9",true,"white");
	Laptop l5=new Laptop("Acer",58000,"i7",false,"Black");
	Laptop l6=new Laptop("APPLE",170000,"i9",true,"white");
	ArrayList<Laptop>laptops=new ArrayList<>();
	laptops.add(l1);
	laptops.add(l2);
	laptops.add(l3);
	laptops.add(l4);
	laptops.add(l5);
	laptops.add(l6);
	//laptops.stream().forEach(x->System.out.println(x));
	//laptops.stream().filter(y->y.isTouchScreeen()).forEach(y1->System.out.println(y1));
	//List<Laptop>n=laptops.stream().filter(y->y.isTouchScreeen()==true&& y.getColor().equalsIgnoreCase("Black")).collect(Collectors.toList());
	//n.forEach(z->System.out.println(z));
	//List<String>c1=laptops.stream().map(x1->x1.getProcessor()).collect(Collectors.toList());
	//c1.forEach(y2->System.out.println(y2));
	//long h=n.stream().count();
	//System.out.println(h);
	//List<Integer>n1=laptops.stream().filter(r->r.isTouchScreeen()==false).map(r1->r1.getPrice()).collect(Collectors.toList());
	//n1.forEach(n2->System.out.println(n2));
	//List<String>n3=laptops.stream().map(c1->c1.getBrand()).filter(c2->c2.equalsIgnoreCase("Apple")).collect(Collectors.toList());
    //n3.forEach(n4->System.out.println(n4));
	
	//Map<String,Laptop>laps=laptops.stream().collect(Collectors.toMap(x->x.getBrand(), y->y));
	//laps.forEach((x,y)->System.out.println(x+" "+y));
	//Set<String>y3=laptops.stream().map(x->x.getBrand()).collect(Collectors.toSet());
	//y3.forEach(y4->System.out.println(y4));
	//List<String>x7=laptops.stream().map(x5->x5.getBrand()).distinct().collect(Collectors.toList());
	//x7.forEach(x8->System.out.println(x8));
	//List<String>x11=laptops.stream().map(x9->x9.getBrand()).sorted().collect(Collectors.toList());
    //x11.forEach(x12->System.out.println(x12));
	//List<String>x14=laptops.stream().map(x13->x13.getColor()).limit(1).collect(Collectors.toList());
   //x14.forEach(x15->System.out.println(x15)); 
}

}
