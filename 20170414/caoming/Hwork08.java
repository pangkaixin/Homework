package com.cheer;

import java.util.Scanner;
/*  
 * 将给定的字符串，按照字典排序。如fdac --> acdf
 */ 
public class Hwork08
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入字符串：");
		String str=sc.next();
		String[] newstr=new String[str.length()];
		for(int i=0;i<str.length();i++)
		{
			newstr[i]=str.substring(i, i+1);
		}
		for(int k=1;k<newstr.length;k++)
		{
			for(int j=0;j<newstr.length-k;j++)
			{
				String temp="";
				if(newstr[j].compareTo(newstr[j+1])>0)
				{
					temp=newstr[j];
					newstr[j]=newstr[j+1];
					newstr[j+1]=temp;	
				}									
			}	
		}
		for(String b:newstr)
		{
			System.out.print(b);	
		}

	}
}
