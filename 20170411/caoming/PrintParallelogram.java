package com.cheer;

public class PrintParallelogram
{
	public static void main(String[] args)
	{ 
    	for(int i=0;i<6;i++)
    	{
			for(int j=i;j<6;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<6;k++)
			{
				System.out.print("*");
			}
			System.out.println();
    	}
	}
}
