package cherr.cm;
import java.util.Scanner;
public class Rhomboid//平行四边形
{
	public static void main(String[] args)
	{
		String blank=" ";
		String pattern="*";
		int c=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter");
		int a=sc.nextInt();
		if(a==4)
		{
			for(int i=1;i<=c;i++)	
			{
				for(int j=c-i;j>0;j--)
				{
					System.out.print(blank);	
				}	
					for(int j=3*c-i;j>3*c-i;j--)
				{
					System.out.print(blank);	
				}	
					for(int k=c+1-i;k<=3*c-i-1;k++)
					{
						System.out.print(pattern);		
					}
					System.out.println();
			}
		}
	}
}

