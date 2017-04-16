package com.cheer;

import java.util.Scanner;
/* 
 *   获取一个字符串在另一个字符串中出现的次数
 */ 
public class Hwork04
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入待检查字符串：");
		String str=sc.next();
		System.out.print("请输入要检查字符串：");
		String str1=sc.next();
		int count=0;
		for(int i=0;i<=str.length()-str1.length();i++)
		{
			String newstr=str.substring(i,i+str1.length());
			if(str1.equals(newstr))
				{
					count++;
					
				}
		}
		System.out.print(count);
	}
}
