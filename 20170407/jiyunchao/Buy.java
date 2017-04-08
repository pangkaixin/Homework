package com.jyc;

import java.util.Scanner;

public class Buy
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入消费金额:");
		int money = input.nextInt();
		System.out.println("是否参与优惠换购活动:");
		if (money >= 50)
		{
			System.out.println("1:满50元,加2元换购百事可乐饮料1瓶");
			System.out.println("2:满100元,加3元换购500ml可乐1瓶");
			System.out.println("3:满100元,加10元换购5公斤面粉");
			System.out.println("4:满200元,加10元换购1个苏泊尔炒菜锅一个");
			System.out.println("5:满200,加20元换购欧莱雅爽肤水一瓶");
			System.out.println("0:不换购");
			System.out.println("请选择:");
			if (input.hasNextInt())
			{
				int choice = input.nextInt();
				switch (choice)
				{
				case 1:
					if (money > 50)
					{
						System.out.println("消费金额是:" + (money + 2));
						System.out.println("成功换购:1瓶百事可乐饮料");
						break;
					} 
					else
					{
						System.out.println("消费不足,无法换购!");
						break;
					}
				case 2:
					if (money > 100)
					{
						System.out.println("消费金额是:" + (money + 2));
						System.out.println("成功换购:1瓶500ml可乐");
						break;
					} 
					else
					{
						System.out.println("消费不足,无法换购!");
						break;
					}
				case 3:
					if (money > 100)
					{
						System.out.println("消费金额是:" + (money + 10));
						System.out.println("成功换购:1包5公斤面粉");
						break;
					} 
					else
					{
						System.out.println("消费不足,无法换购!");
						break;
					}
				case 4:
					if (money > 200)
					{
						System.out.println("消费金额是:" + (money + 10));
						System.out.println("成功换购:1个苏泊尔炒菜锅一个");
						break;
					} 
					else
					{
						System.out.println("消费不足,无法换购!");
						break;
					}
				case 5:
					if (money > 200)
					{
						System.out.println("消费金额是:" + (money + 20));
						System.out.println("成功换购:1瓶欧莱雅爽肤水");
						break;
					} 
					else
					{
						System.out.println("消费不足,无法换购!");
						break;
					}
				case 0:
					System.out.println("不换购");
					break;
				}
			}
			
			else
			{
				System.out.println("输入选择错误!");
			}
		}
	}
}