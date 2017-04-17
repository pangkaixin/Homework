package com.cheer;

import java.util.Scanner;
/* 
 *  将int类型转化成String类型。
 */ 
public class Hwork07
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字:");
		int num = sc.nextInt();
		String str = String.valueOf(num);
		System.out.println(String.valueOf(num));
		
	}
}
