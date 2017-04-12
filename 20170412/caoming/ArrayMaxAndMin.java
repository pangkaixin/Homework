package com.cheer;
import java.util.Scanner;
public class ArrayMaxAndMin
{
	public static void main(String[] args)
	{
		int[] scores=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("请分别输入5位整数");
		for (int i = 0; i < scores.length; i++)
		{
			scores[i]=sc.nextInt();
		}

		int max = scores[0];
		int min = scores[0];
		for(int i = 1; i < scores.length; i++)
		{	
			if(scores[i] > max)
			{
				max = scores[i];
			}
			if(scores[i] < min)
			{
				min=scores[i];
			}
	}
	System.out.println("最大为：" + max);
	System.out.println("最小为：" + min);
	}
}
