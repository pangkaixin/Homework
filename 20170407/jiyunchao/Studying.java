package com.jyc;
/*任务目标:制定学习计划，星期一、三、五学习编程，二、四、六学习英语，
星期日休息。如果输入数值不正确，提示输入不正确。*/
import java.util.Scanner;

public class Studying
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a date(For example:Sun):");
		String week = input.next();
		switch (week)
		{
		case "Mon":
		case "Wed":
		case "Fri":
			System.out.println("Learning programming");
			break;
		case "Tues":
		case "Thu":
		case "Sat":
			System.out.println("Learning English");
			break;
		case "Sun":
			System.out.println("Resting");
			break;
		default:
			System.out.println("You have not entered correctly. Please re-enter!");
			break;
		}
	}
}
