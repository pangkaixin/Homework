package com.jyc;
/*任务目标:根据考试成绩获得奖励，不及格没有礼物，大于60分小于90母亲给他
买部手机，大于等于90分但不是满分100，母亲给他买一台笔记本电脑，
如果是满分100，父亲给他买辆车，如果输入成绩有误，提示“输入成绩有误”。*/
import java.util.Scanner;

public class Gift
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入考试成绩:");
		int score = input.nextInt();
		if (score == 100)
		{
			System.out.println("父亲给他买辆车");
		} else if (score >= 90 && score < 100)
		{
			System.out.println("母亲给他买一台笔记本电脑");
		} else if (score > 60 && score < 90)
		{
			System.out.println("母亲给他买部手机");
		} else if (score < 60)
		{
			System.out.println("没有礼物");
		} else
		{
			System.out.println("您输入成绩有误");
		}
	}
}
