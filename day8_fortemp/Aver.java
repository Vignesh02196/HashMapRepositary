package com.onesoft.day8_fortemp;

public class Aver {
	public static void main(String[]args)
{
	int [] marks= {50,50,75,25,50,70};
	int add=0;
	int avg=0;
	for(int i=0;i<marks.length;i++)
	{
		add=add+marks[i];
		avg=add/5;
		
	}
	System.out.println(avg);
}

}
