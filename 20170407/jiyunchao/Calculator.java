package com.jyc;

import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数:");
		double number1 = input.nextDouble();
		System.out.println("请输入第二个数:");
		double number2 = input.nextDouble();
		System.out.println("请输入运算符:");
		String  operator=input.next();
		double plus = number1 + number2;
		double reduce = number1 - number2;
		double ride = number1 * number2;
		double except = number1 / number2;
		
		switch(operator)
		{
		case "+" : System.out.println("这两个数的和是:" + plus);break;
		case "-" :System.out.println("这两个数的差是:" + reduce );break;
		case "*" :System.out.println("这两个数的积是:" + ride);break;
		case "/" :System.out.println("这两个数的商是:" + except);break;
		}
		
		
		
	}
}
