package com.cheer;

public class PrintRhombus
{
	public static void main(String[] args)
	{ 
    	for(int i=1;i<=5;i++)
    	{
			for(int j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
    	}
		for (int i=1;i<=4;i++)
		{
			for (int j=i-1;j<=2*i-1;j++)
			{
				System.out.print(" ");
			}
			for (int k=7;k>=2*i-1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
