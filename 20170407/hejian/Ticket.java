import java.util.Scanner;
public class Ticket//�ɻ�Ʊ
{
	public static void main(String[] args)
	{
		int money=1000;
		Scanner shuru=new Scanner(System.in);
		System.out.println("Please enter your travel month");//����������·�
		int month=shuru.nextInt();
		System.out.println("Please enter the first class cabin");//�������Ƿ�Ϊͷ�Ȳ�
		String cabin=shuru.next();
		double a=money*0.9;
		double b=money*0.75;
		double c=money*0.6;
		double d=money*0.3;
		if(month>=4&&month<=10)
		{
			if("y".equals(cabin))	
			{
				System.out.println("Peak seasont price"+a);		
			}
			else 
			{
				System.out.println("Peak seasonj price"+b);			
			}
		}
			else if(month>=1&&month<=12)
			{
				if("y".equals(cabin))		
				{
					System.out.println("Season first class price"+c);	
				}
				else
				{
					System.out.println("Economy class price"+d);		
				}
			}
			else
			{
				System.out.println("The information you entered is incorrect. Please enter a valid message");
			}
	}	
}		