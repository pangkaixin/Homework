package com.jyc;

import java.util.Scanner;
public class Homework5
{
	public static void main(String[] args)
	{
		Scanner sc = null;
		boolean cont = true;
		while(cont)
		{
			sc = new Scanner(System.in);
			System.out.print("请输入一个字符串:");
			String str = sc.next();
			System.out.print("请输入要替换的字符:");
			String str1 = sc.next();
			System.out.print("请输入替换成的字符:");
			String str2 = sc.next();
			String newstr = str.replace(str1,str2);
			System.out.println(newstr);
			System.out.print("是否继续?(y/n):");
			String result = sc.next();
			if(!"y".equals(result))
			{
				cont = false;
			}
		}
		sc.close();
		System.out.println("程序结束!");
	}
}
