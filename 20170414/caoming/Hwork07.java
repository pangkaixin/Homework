package com.cheer;

import java.util.Scanner;
/* 
 *  将int类型转化成String类型。
 */ 
public class Hwork07
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("数字：");
		int nub=sc.nextInt();
		String str=""+nub;
		System.out.print(str+str);
	}
}
