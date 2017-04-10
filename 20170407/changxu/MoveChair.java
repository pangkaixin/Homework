package YunSuanDemo;

import java.util.Scanner;
public class MoveChair
{
	public static void main(String[] args)
	{
		int age=0;
		System.out.println("请输入小朋友的年龄：");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("请输入小朋友的性别：");
		Scanner sc1=new Scanner(System.in);
		String b=sc1.nextLine();
		if(age>7)
		{
		System.out.println("老师说：小朋友年龄大于7岁可以搬");
		}else if("男".equals(b)&&age>5)
		{
		System.out.println("老师说：男孩大于5岁就可以");
		}else
		{
		System.out.println("老师说：小朋友还不可以搬");
		}		
	}
}
