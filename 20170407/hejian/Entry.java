import java.util.Scanner;
public class Entry//入口
{
	public static void main(String[] args)
	{
		Scanner shuru=new Scanner(System.in);
		System.out.println("Please enter your username");//请输入你的用户名
		String amd1=shuru.next();
		System.out.println("Enter the password");//请输入你的密码
		String password1=shuru.next();
		String a="heyuming";
		String p="heyuming";
		if(a.equals(amd1))
		{
			if(p.equals(password1))
			{	
				System.out.println("login successful");//登录成功
			}
			else
			{
				System.out.println("Login fail");//登录失败
			}
		}
	}
}