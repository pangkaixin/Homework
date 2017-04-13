package com.jyc;

import java.util.Scanner;

public class Insert
{
	public static void main(String[] args)
	{
		int[] a = new int[6];
		a[0] = 99;
		a[1] = 85;
		a[2] = 82;
		a[3] = 63;
		a[4] = 60;
		int index = a.length;
		System.out.println("请输入新增成绩： ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < a.length; i++)
		{
			if (num > a[i])
			{
				index = i;
				break;
			}
		}

		for (int j = a.length - 1; j > index; j--)
		{
			a[j] = a[j - 1];
		}
		a[index] = num;
		System.out.println("插入成绩的下标是：" + index);
		System.out.println("插入后的成绩信息是： ");
		for (int k = 0; k < a.length; k++)
		{
			System.out.print(a[k] + "\t");

		}
		sc.close();
	}
}