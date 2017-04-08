package com.jyc;
/*任务目标:制定学习计划，星期一、三、五学习编程，二、四、六学习英语，
星期日休息。如果输入数值不正确，提示输入不正确。*/
import java.util.Scanner;

public class Studying
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入星期几:");
		String week = input.next();
		switch (week)
		{
		case "一":
		case "三":
		case "五":
			System.out.println("学习编程");
			break;
		case "二":
		case "四":
		case "六":
			System.out.println("学习英语");
			break;
		case "日":
			System.out.println("休息");
			break;
		default:
			System.out.println("您输入的不正确,请重新输入!");
			break;
		}
	}
}
