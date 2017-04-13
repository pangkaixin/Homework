package com.jyc;

import java.util.Scanner;
public class MaxandMin
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in); 
		int []num = new int[5];
		int max = num[0];
		int min = num[0];
		System.out.println("请输入五个数:");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
			if(num[i] > max)
			{
				max = num[i];
			}

			if(num[4] == min)
			{
				min = num[i];
			}
		}
				
		System.out.println("最大值为:"+max);
		System.out.println("最小值为:"+min);
		sc.close();
	}
}

