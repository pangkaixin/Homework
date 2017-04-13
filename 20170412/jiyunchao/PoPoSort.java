package com.jyc;

public class PoPoSort
{
	public static void main(String[] args)
	{
		int[] num =
		{ 28, 68, 48, 108, 88 };
		int temp = 0;
		for (int j = 1; j <= num.length; j++)
		{
			for (int i = 0; i < num.length - 1; i++)
			{
				if (num[i] > num[i + 1])
				{
					temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < num.length; i++)
		{
			System.out.println(num[i]);
		}
	}
}
