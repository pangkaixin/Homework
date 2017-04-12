package com.jyc;

import java.util.Scanner;
public class LetterSort
{
	public static void main(String[] args)
	{
		Scanner sc = null;
		String[] letter = new String[5];
		System.out.println("请输入5个字母:");
		for (int i = 0; i < letter.length; i++)
		{
			sc = new Scanner(System.in);
			letter[i] = sc.next();
		}
		for (int j = 1; j <= letter.length; j++)
		{
			for (int i = 0; i < letter.length - 1; i++)
			{
				if (letter[i].compareTo(letter[i + 1]) > 0)
				{
					String temp = letter[i];
					letter[i] = letter[i + 1];
					letter[i + 1] = temp;
				}
			}

		}
		for (int i = 0; i < letter.length - 1; i++)
		{
			System.out.print(letter[i] + " ");
		}
		sc.close();
	}
}
