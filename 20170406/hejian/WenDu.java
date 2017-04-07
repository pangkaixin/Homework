import java.util.Scanner;
public class WenDu
{
 	public static void main(String[] args)
 	{
 		Scanner shuru=new Scanner(System.in);
 		System.out.print("请输入华氏温度：");
 		double f=shuru.nextDouble();
 		double c;
 		c=5/9.0*(f-32);
 		System.out.println("华氏温度转换为摄氏温度为："+c);
 	}
}