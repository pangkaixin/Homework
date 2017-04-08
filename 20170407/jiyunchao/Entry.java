package com.jyc;
/*任务目标:简单登录，验证从控制台输入的用户名和密码。
正确输出登录成功，否则登录失败。*/
import java.util.Scanner;

public class Entry
{
	public static void main(String[] args)
	{
		String username = "jiyunchao";
		String password = "jyc199609";
		Scanner input = new Scanner(System.in);
		System.out.println("username:");
		String name = input.next();
		System.out.println("password:");
		String pass = input.next();
		if (name.equals(username) && pass.equals(password))
		{
			System.out.print("登录成功!");
		} else
		{
			System.out.print("登录失败,请重试!");
		}
	}
}