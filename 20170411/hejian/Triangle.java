package cherr.cm;
import java.util.Scanner;
public class Triangle//三角形
{
	public static void main(String[] args)
	{
		String pattern="*";
		String blank=" ";
		int c=5;
		int a[][]=new int[5][9];
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter");
		int b=sc.nextInt();
		if(b==3)
		{
			for(int i=1;i<=c;i++)
			{
				for(int j=c-i;j>=0;j--)	
				{
					System.out.print(blank);
				}
					for(int x=1;x<=2*i-1;x++)
					{
						System.out.print(pattern);
					}
						System.out.println();
			}
		}
	}
}
