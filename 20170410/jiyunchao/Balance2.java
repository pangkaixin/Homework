package com.jyc;

import java.util.Scanner;

public class Balance2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("******************************************");
		System.out.println("请选择购买的商品编号:");
		System.out.println("1.T恤" + "\t" + "2.网球鞋" + "\t\t" + "3.网球拍");
		System.out.println("******************************************");
		int num = 0;// 商品编号
		int num1 = 0;// 购买数量
		String name = "";
		double price = 0.0;// 单价
		double discount = 0.8;// 折扣
		double money = 0.0;// 应付
		double money1 = 0.0;// 实付
		boolean isBuy = true;
		while (isBuy)
		{
			System.out.println("请输入商品编号：");
			num = input.nextInt();
			System.out.println("请输入商品数量：");
			num1 = input.nextInt();
			switch (num)
			{
			    case 1:
			    	  System.out.print(name = "T恤\t\t");
			    	  System.out.print(price = 245);
				      break;
			    case 2:
			    	  System.out.print(name = "网球鞋\t\t");
				      System.out.print(price = 250.0);
				      break;
			    case 3:
			    	  System.out.print(name = "网球拍\t\t");
				      System.out.print(price = 255.0);
				      break;
			}
			System.out.println("\t\t数量:" + num1 + "\t\t合计:" + (price * num1));
			System.out.println("是否继续（y/n）");
			String cont = input.next();
			if (!"y".equals(cont))
			{
				isBuy = false;
			}
			money = money + (price * num1 * discount);
		}
		System.out.println("折扣：" + discount);
		System.out.println("应付金额：" + money);
		System.out.print("实付金额：");
		money1 = input.nextDouble();
		System.out.println("找钱：" + (money1 - money));
		input.close();
	}
}
