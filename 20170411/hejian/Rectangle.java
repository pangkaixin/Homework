package cherr.cm;

import java.util.Scanner;

public class Rectangle// 长方形
{
	public static void main(String[] args)
	{
		String pattern = "*";
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter");
		int b = sc.nextInt();
		int a[][] = new int[5][15];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				if (b == 1)
				{
					System.out.print(pattern);
				}
			}
			System.out.println();
		}
	}
}
