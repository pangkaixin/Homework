package com.jyc;

import java.util.Scanner;
public class Export
{
	public static void main(String[] args)
	{
		Scanner	sc=null;
		System.out.println("1.长方形 2.正方形 3.三角形 4.平行四边形 5.菱形 6.乘法口诀表");
		for(int i=1;i<=6;i++)
		{
			sc=new Scanner(System.in);
			System.out.println("请输入一个数字编号:");
			int number = sc.nextInt();
			switch(number)
			{
				case 1:
					 {
					 System.out.print("请输入矩形的长:");
					 double longer = sc.nextDouble();
					 System.out.print("请输入矩形的宽:");
					 double wide = sc.nextDouble();
					 for(int u = 0;u <= longer;u++)//矩形的长
					 {
						 for(int j = 0;j<=wide;j++)//矩形的宽
						 {
							 System.out.print("*");
						 }
						 System.out.print("\n");
					 } 
			break;}
			case 2:
				 {
					 System.out.println("请输入正方形的边长:");
					 double side = sc.nextDouble();
					 for(int a =0;a<=side;a++)//正方形边长
					 {
						 for(int b =0;b<=side;b++)//正方形边长
						 {
							 System.out.print("*"+" ");
						 }
						 System.out.print("\n");
					 }
			break;}
			case 3:	 
				 {
					System.out.println("请输入三角形的一边长:");
					 double side1 = sc.nextDouble();
					 for (int c=0;c<side1;c++)//控制行数  
					{  
						for (double d=side1;d>=0;d--)  
						{  
							if (d>c)//每行中" "的个数  
							{  
								System.out.print(" ");  
							}  
							else//每行中*的个数  
							{  
								System.out.print("* ");  
							}  
						}  
						System.out.println(); 
					}
			break;}
			case 4:
				 {
					System.out.println("请输入平行四边形的一边长:");
					double lon = sc.nextDouble();
					
			break;}
            case 5:
				 {
					System.out.println("请输入菱形的的一边长:");
					double lon1 = sc.nextDouble();
					
			break;}
			case 6:
				 {
					             
				 }
			default:
				    System.out.println("你输入数字有误,请重新输入!");				 
		}
		   System.out.println("请问是否继续输出：(y/n)");
		   String str=sc.next();
		   if("n".equals(str))
		   {
		   	System.out.println("结束输入");
		   	break;
		   }
		}
		sc.close();
	}
}
