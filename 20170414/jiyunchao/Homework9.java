package com.jyc;

import java.util.Scanner;
public class Homework9
{
	public static void main(String[] args)
	{
		Scanner sc = null;
		boolean cont= true;
		while(cont)
		{	
			sc = new Scanner(System.in);
			System.out.print("请输入输入一个身份证号:");
			String num = sc.next();
			int size = num.length();
			if(size == 15 || size == 18)
			{
				switch(size)
				{
					case 15:
					{
						char year1 = num.charAt(6);
						char year2 = num.charAt(7);
						char month1 = num.charAt(8);
						char month2 = num.charAt(9);
						char day1 = num.charAt(10);
						char day2 = num.charAt(11);
						System.out.print("此人的生日是:");
						System.out.print("19");
						System.out.print(year1);
						System.out.print(year2);
						System.out.print("年");
						System.out.print(month1);
						System.out.print(month2);
						System.out.print("月");
						System.out.print(day1);
						System.out.print(day2);
						System.out.print("日"+"\n");
					}
					break;
					case 18:
					{
						char year1 = num.charAt(6);
						char year2 = num.charAt(7);
						char year3 = num.charAt(8);
						char year4 = num.charAt(9);
						char month1 = num.charAt(10);
						char month2 = num.charAt(11);
						char day1 = num.charAt(12);
						char day2 = num.charAt(13);
						System.out.print("此人的生日是:");
						System.out.print(year1);
						System.out.print(year2);
						System.out.print(year3);
						System.out.print(year4);
						System.out.print("年");
						System.out.print(month1);
						System.out.print(month2);
						System.out.print("月");
						System.out.print(day1);
						System.out.print(day2);
						System.out.print("日"+"\n");
					}
					break;
				}
			}
			else
			{
				System.out.println("您输入的身份证号不正确,请重新输入!");
			}
			System.out.print("是否继续?(y/n):");
			String result = sc.next();
			if(!"y".equals(result))
			{
				cont = false;
			}
		}
		sc.close();
		System.out.println("输入结束!");		
	}
}
