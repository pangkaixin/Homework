package YunSuanDemo;

import java.util.Scanner;
public class Prize
{
	public static void main(String[] args)
	{
	System.out.println("小明考试成绩：");	
	Scanner sc=new Scanner(System.in);
	int score=sc.nextInt();
	if(score==100)
	{
	System.out.println("爸爸给你买辆车");	
	}else if(90<=score&& score < 100)
	{
	System.out.println("妈妈给你买台电脑");	
	}else if(score > 60 && score < 90)
	{
	System.out.println("妈妈给你买部手机");	
	}else if(score<60)
	{
	System.out.println("没有礼物");	
	}else
	{
	System.out.println("输入有误");	
	}
	}
}
