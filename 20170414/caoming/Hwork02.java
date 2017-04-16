package com.cheer;

import java.util.Scanner;

/*  给定一个由数字组成的字符串,如:"1239586838923173478943890234092",统计出每个数字出现的次数。
 */

public class Hwork02
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入纯数字字符串：");
		String str=sc.next();	
		String[] nub=new String[str.length()] ;
		for(int j=0;j<10;j++)
		{
			String s=""+j;
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				
				nub[i]=str.substring(i,i+1);
				if(s.equals(nub[i]))
				{	
					count++;	
					continue;
					
				}				
			}
			System.out.println(s+"出现了"+count+"次");
		}
	}
}
