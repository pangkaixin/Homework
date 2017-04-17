package com.jyc;

public class Homework3
{
	public static void main(String[] args)
	{
		String s = "abcdef";
		System.out.println(reverse1(s));
		
	}

	public static String reverse1(String s)
	{
		char []array=s.toCharArray();
		String resever="";
		for(int i=array.length-1;i>=0;i--)
		{
			resever+=array[i];
		}
		return resever;
	}
}	
