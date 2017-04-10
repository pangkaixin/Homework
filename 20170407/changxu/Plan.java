package YunSuanDemo;

import java.util.Scanner;
public class Plan
{
	public static void main(String[] args)
	{
	System.out.println("请输入星期几");
	Scanner sc=new Scanner(System.in);
	String day=sc.nextLine();
		switch (day)
		{
		case "星期一":
		case "星期三":
		case "星期五":
			System.out.println("今天学习编程");
			break;
		case "星期二":
		case "星期四":
		case "星期六":
			System.out.println("今天学习英语");
			break;
		case 星期日:
			System.out.println("今日休息");
			break;
		default:
			System.out.println("输入不正确");
			break;
	}
}
