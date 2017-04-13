package com.jyc;

import java.util.Scanner;
public class Game2 
{
	public static void main(String[] args) 
	{
		System.out.println("青鸟迷你游戏系统 > 游戏晋级\n");
		
		double gt80score = 0.0;//分数
		int count = 5;
		Scanner sc = null;
		boolean isFull5Set =true;
		for(int i=1;i<=count;i++) 
		{
			sc = new Scanner(System.in);
			System.out.printf("您正在玩第%s局，成绩为:",i);
			int score = sc.nextInt();
			if(score>=80)
			{
				gt80score++;
			}
			if(i==5)
			{
				break;
			}
			System.out.println("继续玩下一局吗？（y/n)");
			String cont = sc.next();
			if("n".equals(cont))
			{
				System.out.println("游戏结束!");
				isFull5Set = false;
				break;
			}
		}
			if(isFull5Set)
			{
				if (gt80score / count >=0.8)
				{
					System.out.println("\n恭喜，通过一级！");
				}
				else if(gt80score / count >=0.6)
				{
					System.out.println("\n恭喜，通过二级！");
				}
				else
				{
					System.out.println("\n对不起,您没有取胜");
				}
			}
		else
		{
			System.out.println("\n对不起你没有取胜,继续加油!");
		}
	}	
				
}		
