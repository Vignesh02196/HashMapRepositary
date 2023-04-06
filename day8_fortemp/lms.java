package com.onesoft.day8_fortemp;

public class lms {
	public static void main(String [] args)
	{
       int aa=Integer.parseInt(args[0]);
       int bb=Integer.parseInt(args[1]);
       int cc=Integer.parseInt(args[2]);
       int dd=Integer.parseInt(args[3]);
       int [] values= {aa,bb,cc,dd};
       for(int i=0;i<values.length;i++)
       {
    	   if(values[i]>10)
    	   {
    		   System.out.println(values[i]);
    	   }
       }
	}
}
