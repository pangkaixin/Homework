package com.jyc;
//任务目标:实现一个计算器功能，从控制台分别输入两个数，还有还进行计算的
//运算符（+-*/)然后输出相应结果。
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
		double plus = number1 + number2;
		double reduce = number1 - number2;
		double ride = number1 * number2;
		double except = number1 / number2;
		System.out.println("这两个数的和是:" + plus);
		System.out.println("这两个数的差是:" + reduce);
		System.out.println("这两个数的积是:" + ride);
		System.out.println("这两个数的商是:" + except);
	}
}
