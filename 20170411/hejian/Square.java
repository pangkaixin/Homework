package cherr.cm;
import java.util.Scanner;
public class  Square//正方形
{
	public static void main(String[] args)
	{
		String pattern="*";
		int a[][]=new int [6][6];
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter");
		int b=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(b==2)
				{
					System.out.print(pattern);
				}
			}
			System.out.println();
		}
	}
}
