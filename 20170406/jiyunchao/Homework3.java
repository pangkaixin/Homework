import java.util.Scanner;

public class Homework3
{
	public static void main(String[] args)
	{
		double rate1y = 2.25 / 100; // 存期1年利率
		double rate2y = 2.7 / 100;// 存期2年利率
		double rate3y = 3.24 / 100;// 存期3年利率
		double rate5y = 3.6 / 100;// 存期5年利率
		Scanner input = new Scanner(System.in);
		System.out.print("请输入本金:");

		double principal = input.nextInt();

		double benxi1 = (principal + (principal) * rate1y);

		double benxi2 = (principal + (principal) * rate2y*2);

		double benxi3 = (principal + (principal) * rate3y*3);

		double benxi5 = (principal + (principal) * rate5y*5);
		System.out.println("本金为:" + principal);
		System.out.println("存取一年的本息是:" + benxi1);
		System.out.println("存取两年的本息是:" + benxi2);
		System.out.println("存取三年的本息是:" + benxi3);
		System.out.println("存取五年的本息是:" + benxi5);

	}
}