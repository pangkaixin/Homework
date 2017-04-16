package com.cheer;
import java.util.Scanner;
/*  给定一个字符串,判断该字符串中是否包含某个子串.如果包含,求出子串的所有出现位置.
 *  如:"abcbcbabcb34bcbd"中,"bcb"子串的出现位置为:1,7,12.字符串和子串均由用户输入。
 */ 
public class Hwork01
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入待检查字符串：");
		String str=sc.next();
		System.out.print("请输入要检查字符串：");
		String str1=sc.next();
		for(int i=0;i<=str.length()-str1.length();i++)
		{
			String newstr=str.substring(i,i+str1.length());
			if(str1.equals(newstr))
				{
					System.out.print(i+"\t");
				}
		}
	}
}
