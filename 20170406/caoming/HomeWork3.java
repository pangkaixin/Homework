//import java.util.Scanner;
//public class HomeWork3			
//{
//	public static void main(String[] args)
//	{
//		Scanner input = new Scanner(System.in);
//		System.out.print("�����뱾�� : ");
//		double principal = input.nextInt();
//		double rate1y = 2.25/100;  
//		double rate2y = 2.7/100;
//		double rate3y = 3.24/100;
//		double rate5y = 3.6/100;
//		double all1=principal*rate1y+principal;
//		double all2=(principal*rate2y)*2+principal;
//		double all3=(principal*rate3y)*3+principal;
//    double all5=(principal*rate5y)*5+principal;
//		System.out.println("һ�걾Ϣ�� ��"+all1);
//	  System.out.println("���걾Ϣ�� ��"+all2);
//	  System.out.println("���걾Ϣ�� ��"+all3);
//	  System.out.println("���걾Ϣ�� ��"+all5);
//	  
//	}
//
//}


import java.util.Scanner;
public class HomeWork3			
{
	public static void main(String[] args)
	{
   
		Scanner input = new Scanner(System.in);
		System.out.println("�����뱾�� : ");
		System.out.println("���������� :(��ܰ��ʾֻ�ṩ1��2��3��5��) ");
		double principal = input.nextInt();
		int year = input.nextInt();	
		while(year==1)
			{
				double rate1y = 2.25/100;
				double all1=principal*rate1y+principal;
				System.out.println("һ�걾Ϣ�� ��"+all1);
				break;
			}
		while(year==2)
			{
				double rate2y = 2.7/100;
				double all2=(principal*rate2y)*2+principal;
				System.out.println("���걾Ϣ�� ��"+all2);
				break;
			}
		while(year==3)
			{
				double rate3y = 3.24/100;
				double all3=(principal*rate3y)*3+principal;
				System.out.println("���걾Ϣ�� ��"+all3);
				break;
			}
			
		while(year==5)
			{
				double rate5y = 3.6/100;
				double all5=(principal*rate5y)*5+principal;
				System.out.println("���걾Ϣ�� ��"+all5);
				break;
			}  
	}

}