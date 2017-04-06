//import java.util.Scanner;
//public class HomeWork3			
//{
//	public static void main(String[] args)
//	{
//		Scanner input = new Scanner(System.in);
//		System.out.print("请输入本金 : ");
//		double principal = input.nextInt();
//		double rate1y = 2.25/100;  
//		double rate2y = 2.7/100;
//		double rate3y = 3.24/100;
//		double rate5y = 3.6/100;
//		double all1=principal*rate1y+principal;
//		double all2=(principal*rate2y)*2+principal;
//		double all3=(principal*rate3y)*3+principal;
//    double all5=(principal*rate5y)*5+principal;
//		System.out.println("一年本息是 ："+all1);
//	  System.out.println("两年本息是 ："+all2);
//	  System.out.println("三年本息是 ："+all3);
//	  System.out.println("五年本息是 ："+all5);
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
		System.out.println("请输入本金 : ");
		System.out.println("请输入年限 :(温馨提示只提供1，2，3，5年) ");
		double principal = input.nextInt();
		int year = input.nextInt();	
		while(year==1)
			{
				double rate1y = 2.25/100;
				double all1=principal*rate1y+principal;
				System.out.println("一年本息是 ："+all1);
				break;
			}
		while(year==2)
			{
				double rate2y = 2.7/100;
				double all2=(principal*rate2y)*2+principal;
				System.out.println("两年本息是 ："+all2);
				break;
			}
		while(year==3)
			{
				double rate3y = 3.24/100;
				double all3=(principal*rate3y)*3+principal;
				System.out.println("三年本息是 ："+all3);
				break;
			}
			
		while(year==5)
			{
				double rate5y = 3.6/100;
				double all5=(principal*rate5y)*5+principal;
				System.out.println("五年本息是 ："+all5);
				break;
			}  
	}

}