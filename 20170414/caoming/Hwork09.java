package com.cheer;

import java.util.Scanner;
/*  
 *  从身份证号码中获取生日，并打印输出。
 */ 
public class Hwork09
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入身份证号码：");
		String str=sc.next();
		String newstr=str.substring(6, 14);
		System.out.print(newstr);
		
	}
}
