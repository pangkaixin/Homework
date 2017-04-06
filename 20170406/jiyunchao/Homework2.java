import java.util.Scanner;

public class Homework2
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		System.out.print("请输入一个华氏度温度: ");

		double Fahrenehit = input.nextInt();

		double Celsius = ((Fahrenehit - 32) * (5.0 / 9));

		System.out.println("摄氏度为: " + Celsius);
		
	}

}

