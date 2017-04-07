import java.util.Scanner;
public class YinHangBenXi
{
	public static void main(String[] args)
	{
		double are[]={0.0225,0.027,0.0324,0,0.036};
		double money,interest;//钱，利息
		int years;//年
		Scanner shuru=new Scanner(System.in);
		System.out.print("请输入要存入的金额：");
		money=shuru.nextDouble();
		System.out.print("请输入要存入的年限：");
		years=shuru.nextInt();
		interest=money*are[years-1]*years;
		money=money+interest;
		System.out.println(money);
	}
}