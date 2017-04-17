package wanghanyang;

import java.util.*;
public class Sort1{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个需要按字典顺序排序的字符串");
		String a=sc.next();
		String temp = "";
		String[] Arr = a.split("");

		for (int i = 1; i < Arr.length; i++)
		{
			for (int j = 0; j < Arr.length - i ; j++)
			{
				if (Arr[j].compareTo(Arr[j + 1]) > 0)
				{
					temp = Arr[j];
					Arr[j] = Arr[j + 1];
					Arr[j + 1] = temp;
				}
			}

		}
		for (int k = 0; k < Arr.length; k++)
		{
			System.out.print(Arr[k] + " ");
		}
	}
}
