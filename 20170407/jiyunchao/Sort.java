package com.jyc;
//任务目标:从键盘输入3个整数，然后按照从大到小输出。
import java.util.Scanner;

public class Sort
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数:");
		int num1 = input.nextInt();
		System.out.println("请输入第二个数:");
		int num2 = input.nextInt();
		System.out.println("请输入第三个数:");
		int num3 = input.nextInt();
		int x = 0;
		if (num1 < num2)
		{
			x = num1;
			num1 = num2;
			num2 = x;
		}
		if (num1 < num3)
		{
			x = num1;
			num1 = num3;
			num3 = x;
		}
		if (num2 < num3)
		{
			x = num2;
			num2 = num3;
			num3 = x;
		}
		System.out.print("排序后的数为:" + num1 + "  " + num2 + "  " + num3);
	}
}
