import java.util.Scanner;
public class YinHangBenXi
{
	public static void main(String[] args)
	{
		double are[]={0.0225,0.027,0.0324,0,0.036};
		double money,interest;//Ǯ����Ϣ
		int years;//��
		Scanner shuru=new Scanner(System.in);
		System.out.print("������Ҫ����Ľ�");
		money=shuru.nextDouble();
		System.out.print("������Ҫ��������ޣ�");
		years=shuru.nextInt();
		interest=money*are[years-1]*years;
		money=money+interest;
		System.out.println(money);
	}
}