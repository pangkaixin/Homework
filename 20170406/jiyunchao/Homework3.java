import java.util.Scanner;

public class Homework3
{
	public static void main(String[] args)
	{
		double rate1y = 2.25 / 100; // ����1������
		double rate2y = 2.7 / 100;// ����2������
		double rate3y = 3.24 / 100;// ����3������
		double rate5y = 3.6 / 100;// ����5������
		Scanner input = new Scanner(System.in);
		System.out.print("�����뱾��:");

		double principal = input.nextInt();

		double benxi1 = (principal + (principal) * rate1y);

		double benxi2 = (principal + (principal) * rate2y*2);

		double benxi3 = (principal + (principal) * rate3y*3);

		double benxi5 = (principal + (principal) * rate5y*5);
		System.out.println("����Ϊ:" + principal);
		System.out.println("��ȡһ��ı�Ϣ��:" + benxi1);
		System.out.println("��ȡ����ı�Ϣ��:" + benxi2);
		System.out.println("��ȡ����ı�Ϣ��:" + benxi3);
		System.out.println("��ȡ����ı�Ϣ��:" + benxi5);

	}
}