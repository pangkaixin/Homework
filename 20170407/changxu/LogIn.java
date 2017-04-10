package YunSuanDemo;

import java.util.Scanner;
public class LogIn
{
		public static void main(String[] args)
		{
		System.out.println("请输入用户名：");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println("请输入密码：");
		Scanner sc1=new Scanner(System.in);
		int b=sc1.nextInt();
		String userName="C";
		int password=123;
		if(b==password&&a.equals(userName))
		{
		System.out.println("登录成功");
		}else{		
		System.out.println("登录失败");
		}
}
}
