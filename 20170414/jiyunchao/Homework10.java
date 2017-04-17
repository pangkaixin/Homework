package com.jyc;

import java.util.Scanner;
public class Homework10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String str = sc.next();
		System.out.println("请输入要删除字符的起始索引:");
		int num = sc.nextInt();
		System.out.println("请输入要删除字符的结束索引:");
		int num1 = sc.nextInt();
		if(num >0 && num < str.length() || num1 >0 && num1 <= str.length())
		{
			StringBuffer sb = new StringBuffer(str);
			sb.delete(num,num1);
			System.out.println("删除索引所对应的字符后的字符串是:"+sb.toString());
		}
		else
		{
			System.out.println("你输入索引有误!");
		}
	}
}
