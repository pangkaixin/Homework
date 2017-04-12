package cherr.cm;
import java.util.Scanner;
public class Multiplication //乘法表格
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(a==6)
				{
					System.out.print(+j+"*"+i+"="+(i*j)+"\t");
				}
			}
			System.out.println();
		}
	}
}
