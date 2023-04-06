package com.onesoft.day8_fortemp;

public class Thos {
	public static void main(String [] args)
	{
		int [] prices= {101,99,115,117,78,155};
		
		for(int i=0;i<prices.length;i++)
		{
			if(prices[i]>100) {
				System.out.println(prices[i]+1000);
			}
			
		}
	}

}
