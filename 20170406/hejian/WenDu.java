import java.util.Scanner;
public class WenDu
{
 	public static void main(String[] args)
 	{
 		Scanner shuru=new Scanner(System.in);
 		System.out.print("�����뻪���¶ȣ�");
 		double f=shuru.nextDouble();
 		double c;
 		c=5/9.0*(f-32);
 		System.out.println("�����¶�ת��Ϊ�����¶�Ϊ��"+c);
 	}
}