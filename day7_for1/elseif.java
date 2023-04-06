package com.onesoft.day7_for1;

public class elseif {
	public static void main(String[] args)
	{
		int pCount=0;
		int ppCount=0;
		int nCount=0;
		for (int i=-25;i<=25;i++)
		{
			if(i>=0)
			{
				pCount++;
				}
			else if(i<=0)
			{
				ppCount++;
				}
			else 
			{
				nCount++;
			}
		}
		System.out.println("Count="+pCount);
		System.out.println("Count="+ppCount);
		System.out.println("Count="+nCount);
	}
	

}
