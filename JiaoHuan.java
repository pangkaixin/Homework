//1.交换两个数的值。
import java.util.Scanner;
public class JiaoHuan
{
	public static void main(String []args)
	{
		int i=1;
		int j=2;
    int temp=0;
    temp=i;
    i=j;
    j=temp;
    System.out.println("i："+i;"j:"+j);	
//2.通过控制台输入华氏温度，然后转化成摄氏温度。       
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入华氏温度：");    
    double fahre=sc.nextDouble();
    double centi= (double)((n - 32) * 5) / 9;    
    System.out.println("华氏温度"+fahre+"转化为摄氏温度为："+centi);
//3.计算银行本息          
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入本金：");
    int capital=sc.nextInt();
    double rate1y = 2.25/100;
    double rate2y = 2.7/100;
    double rate3y = 3.24/100;
    double rate5y = 3.6/100;
    double dollar1=capital*rate1y;
    double dollar2=capital*rate2y;
    double dollar3=capital*rate3y;
    double dollar5=capital*rate5y;
    System.out.println("存取一年后的本息是："+dollar1);
    System.out.println("存取二年后的本息是："+dollar2);
    System.out.println("存取三年后的本息是："+dollar3);
    System.out.println("存取五年后的本息是："+dollar5);
	}
}