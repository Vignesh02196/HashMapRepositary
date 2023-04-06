package com.onesoft.day8_fortemp;

public class odd {
	public static void main(String args[])
	{
		int [] nums= {2,3,7,9};
		int count=0;
		for(int i=0;i<nums.length;i++)
			
		{
			if(nums[i]%2!=0)
			{
				count++;
				
			}
			
			
		}
		System.out.println(count);
	}

}
