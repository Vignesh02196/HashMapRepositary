package com.onesoft.day8_fortemp;

public class Neg {
	public static void main(String args[])
	{
		int [] nums= {-10,-11,-9,-8,-7,0,7,8,9,11};
		int count=0;
		for(int i=0;i<nums.length;i++)
			
		{
			if(nums[i]<0)
			{
				count++;
				
			}
			
		}
		System.out.println(count);
	}

}
