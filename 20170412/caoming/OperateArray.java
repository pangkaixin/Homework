package com.cheer;
import java.util.Scanner;
public class OperateArray
{
	public static void main(String[] args)
	{	
		int[] arrays ={ 8, 4, 2, 1, 23, 344, 12 };
		int sum = 0;
		System.out.println("The arrays contains:");
		for (int i = 0; i < arrays.length; i++)
		{
			System.out.println(arrays[i] + "\t");
			sum += arrays[i];
		}
		System.out.println();
		System.out.println("Those elements sum is:"+sum);
		Scanner sc = null;
		boolean isGoOn = true;
		while (isGoOn)
		{
			sc = new Scanner(System.in);
			System.out.println("Please input the element:");
			int value = sc.nextInt();
			if (isExist(arrays, value))
			{
				System.out.println("The value is exist in the arrays");
			} else
			{
				System.out.println("The value is not exist in the arrays");
			}
			System.out.println("Go on?(y/n)");
			String s = sc.next();
			while (!"y".equals(s) && !"n".equals(s))
			{
				System.out.println("the value you put is not valid,please input again5");
				s = sc.next();
			}
			if ("n".equals(s))
			{
				isGoOn = false;
				System.out.println("Game over!");
			}
		}
		sc.close();
	}

	public static boolean isExist(int[] arrays, int value)
	{
		int count = 0;
		for (int element : arrays)
		{
			count++;
			if (element == value)
			{
				return true;
			}
			if (count == arrays.length)
			{
				return false;
			}
		}
		return false;
	}
}
