import java.util.Scanner;

public class Homework2
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		System.out.print("������һ�����϶��¶�: ");

		double Fahrenehit = input.nextInt();

		double Celsius = ((Fahrenehit - 32) * (5.0 / 9));

		System.out.println("���϶�Ϊ: " + Celsius);
		
	}

}

