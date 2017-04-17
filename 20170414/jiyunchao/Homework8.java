package com.jyc;

public class Homework8  
{
	public static void main(String[] args)
	{
		String a[]={"j","h","i","e"};
		for(int i =1;i<a.length;i++)
			{
				for(int j = 0;j<a.length-i;j++)
				{
					if(a[j+1].compareTo(a[j])<0)
					{
						String temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
				}	
			}
			for(int i = 0;i<a.length;i++)
			{
				System.out.print(a[i]+"\t");
			}
	}
}