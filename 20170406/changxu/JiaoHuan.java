//1.������������ֵ��
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
    System.out.println("i��"+i;"j:"+j);	
//2.ͨ������̨���뻪���¶ȣ�Ȼ��ת���������¶ȡ�       
    Scanner sc=new Scanner(System.in);
    System.out.println("�����뻪���¶ȣ�");    
    double fahre=sc.nextDouble();
    double centi= (double)((n - 32) * 5) / 9;    
    System.out.println("�����¶�"+fahre+"ת��Ϊ�����¶�Ϊ��"+centi);
//3.�������б�Ϣ          
    Scanner sc=new Scanner(System.in);
    System.out.println("�����뱾��");
    int capital=sc.nextInt();
    double rate1y = 2.25/100;
    double rate2y = 2.7/100;
    double rate3y = 3.24/100;
    double rate5y = 3.6/100;
    double dollar1=capital*rate1y;
    double dollar2=capital*rate2y;
    double dollar3=capital*rate3y;
    double dollar5=capital*rate5y;
    System.out.println("��ȡһ���ı�Ϣ�ǣ�"+dollar1);
    System.out.println("��ȡ�����ı�Ϣ�ǣ�"+dollar2);
    System.out.println("��ȡ�����ı�Ϣ�ǣ�"+dollar3);
    System.out.println("��ȡ�����ı�Ϣ�ǣ�"+dollar5);
	}
}