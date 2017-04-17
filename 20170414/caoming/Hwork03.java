package com.cheer;
import java.util.Scanner;
/*  
 *  字符串反转 abcdef，要求输出结果为fedcba。
 */ 
public class Hwork03
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入待检查字符串：");
		String str=sc.next();
		String[] newstr=new String[str.length()];
		for(int i=0;i<str.length();i++)
		{
			newstr[i]=str.substring(i,i+1);

		}
		for(int j=str.length()-1;j>=0;j--)
		{
			System.out.print(newstr[j]);
		}
	}
}

