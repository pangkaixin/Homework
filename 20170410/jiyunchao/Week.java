package com.jyc;

import java.util.Scanner;

public class Week
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean week=true;
		while(week)
		{
		System.out.println("请输入一个星期所对应的数字(1~7):");
		int num = input.nextInt();
		switch (num)
		{
			case 1: 
				 System.out.println("Mon.");
			     break;
			case 2: 
				 System.out.println("Tues.");
			     break;
			case 3: 
				 System.out.println("Wed.");
				 break;
			case 4: 
				 System.out.println("Thur.");
				 break;
			case 5: 
				 System.out.println("Fri.");
				 break;
			case 6: 
				 System.out.println("Sat.");
				 break;
			case 7: 
				 System.out.println("Sun.");
				 break;
			default:
				 System.out.println("您的输入有误,请重新输入!");
				 break;
		}	 
		}
		input.close();
	}
}