package YunSuanDemo;

import java.util.Scanner;
public class Sort
{
	public static void main(String[] args)
	{
	System.out.println("请输入第一位数");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("请输入第二位数");
	Scanner sc1=new Scanner(System.in);
	int b=sc1.nextInt();
	System.out.println("请输入第三位数");
	Scanner sc2=new Scanner(System.in);
	int c=sc2.nextInt();
	int temp = 0 ; 
	if(a>b){ 
	temp = a; 
	a = b ; 
	b = temp ; 
	} 
	if(a>c){ 
	temp = a; 
	a = c ; 
	c = temp ; 
	} 
	if(b>c){ 
	temp = b; 
	b = c ; 
	c = temp ; 
	} 
	System.out.println(a+","+b+","+c); 
	}
}