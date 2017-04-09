import java.util.Scanner;
public class Calculator//计算器
{
	public static void main(String[] args)
	{
		Scanner shuru=new Scanner(System.in);
		System.out.println("Please enter two values");//请输入两个数值
		double one=shuru.nextDouble();
		double two=shuru.nextInt();z
		double sum=one+two;//和
		double difference=one-two;//差
		double product=one*two;//积
		double quotient=one/two;//商
		System.out.println("the sum"+sum);
		System.out.println("the difference"+difference);
		System.out.println("the product"+product);
		System.out.println("the quotient"+quotient);
	}
}