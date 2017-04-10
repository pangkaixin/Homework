package com.jyc;

import java.util.Scanner;

public class Balance
{
	public static void main(String[] args)
	{
		System.out.println("MyShopping管理系统 > 购物结算");
		System.out.println("                             ");
		System.out.println("*****************************************");
		System.out.println("请选择购买的商品编号:");
		System.out.println("1.T 恤/t2.网球鞋/t3.网球拍");
		System.out.println("*****************************************");
		boolean isBuy = true;
		Scanner input = new Scanner(System.in);
		while (isBuy)
		{
			System.out.println("请输入商品编号:");
			int num = input.nextInt();
			switch (num)
			{
				case 1:
					 System.out.println("T 恤/t￥245.0");
					 break;
				case 2:
					 System.out.println("网球鞋/t￥325.0");
					   break;
				case 3:
					 System.out.println("网球拍/t￥265.0");
				     break;
			}
			System.out.println("是否继续(y/n)");
			String cont = input.next();
			if (!"y".equals(cont))
			{
				isBuy = false;
			}
		}
		input.close();
		System.out.println("程序结束!");
	}
}
