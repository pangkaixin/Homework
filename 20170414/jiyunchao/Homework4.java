package com.jyc;

public class Homework4
{
	public static void main(String[] args)
	{
		
		String str = "abcacbbjabcadadabcsdabc";
		String str1 = "abc";
		int count=0;
		for(int i=0;i<=str.length()-str1.length();i++)
		{
			String newstr=str.substring(i,i+str1.length());
			if(str1.equals(newstr))
				{
					count++;
					
				}
		}
		System.out.print(str1+"出现了"+count+"次");
	} 
}
