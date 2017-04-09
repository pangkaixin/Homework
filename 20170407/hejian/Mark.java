import java.util.Scanner;
public class Mark//成绩
{
	public static void main(String[] args)
	{
		Scanner shuru=new Scanner(System.in);
		System.out.println("Please enter your score");//请输入你的分数
		int mark=shuru.nextInt();
		if(mark==100)
		{
			System.out.println("Give you a car as a gift");//送你一辆车作为礼物
		}
		else if(mark>=90)
		{
			System.out.println("Send you a laptop");	//送你一台笔记本电脑
		}
		else if(mark>60)
		{
			System.out.println("Send you a cell phone");//送你一部手机
		}
		else if(mark<=60&&mark>=0)
		{
			System.out.println("No gifts, good effort");	//没有礼物，好好努力
		}
		else
		{
			System.out.println("You entered the wrong results, please enter the correct results");	//你输入的成绩有误，请输入正确的成绩
		}
	}
}