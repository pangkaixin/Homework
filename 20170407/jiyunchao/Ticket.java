package com.jyc;
/*任务目标:计算航班票价，从控制台输入原票价，出行月份（1-12），
机舱类型（1.经济型、2.头等舱），如果是旺季（4月到10月），头等舱打9折，
如果是经济舱打75折；如果是淡季（旺季以外都是淡季），淡季头等舱打6折，
经济舱打3折。*/
import java.util.Scanner;

public class Ticket
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入原票价:");
		double money = input.nextDouble();
		System.out.println("请输入出行月份(1-12):");
		int month = input.nextInt();
		System.out.println("请输入机舱类型(1.经济舱、2.头等舱):");
		int cabin = input.nextInt();
		switch (month)
		{
		case 1:
		case 2:
		case 3:
		case 11:
		case 12:
			if (cabin == 1)
			{
				System.out.println("折后票价为:" + money * 0.3);
				break;
			} else
			{
				System.out.println("折后票价为:" + money * 0.6);
				break;
			}
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			if (cabin == 1)
			{
				System.out.println("折后票价为:" + money * 0.75);
				break;
			} else
			{
				System.out.println("折后票价为:" + money * 0.9);
				break;
			}
		default:System.out.println("你输入的票价有误!请重新输入!!!");
		}
	}
}
