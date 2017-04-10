package YunSuanDemo;

import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args)
	{
	System.out.println("请输入第1个阿拉伯数：");	
	Scanner sc=new Scanner(System.in);
	double a=sc.nextInt();
	System.out.println("请输入第2个阿拉伯数：");	
	Scanner sc1=new Scanner(System.in);
	double b=sc1.nextInt();
	System.out.println("请输入运算符：");	
	Scanner sc2=new Scanner(System.in);
	String str=sc2.nextLine();
	if("+".equals(str))
	{
	System.out.println(a+b);	
	}
	else if("-".equals(str))
	{
	System.out.println(a-b);	
	}
	else if("*".equals(str))
	{
	System.out.println(a*b);	
	}
	else if("/".equals(str)&&a!=0)
	{
	System.out.println(a/b);	
	}
	else
	{
	System.out.println("亲，没有这运算");	
	}
	}
}
