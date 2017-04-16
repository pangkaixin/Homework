package home1;
import java.util.Scanner;
public class BirthDay
{
	public static void main(String[] args)
	{
		Scanner sc=null;
		System.out.println("请输入身份证号：");
		sc=new Scanner(System.in);
		String id=sc.next();
		String birth=id.substring(10,14);
		System.out.println("您的生日是："+birth);
		sc.close();
	}
}