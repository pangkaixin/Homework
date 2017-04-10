import java.util.Scanner;
public class Day
{
	public static void main(String[] args)
	{
		boolean week=true;
		while(week)
		{
			Scanner shuru=new Scanner(System.in);
			System.out.println("请输入：");	
			int a=shuru.nextInt();
			switch(a)
			{
				case 1:
				System.out.println("MON");		
				break;
				case 2:
				System.out.println("TUE");		
				break;
				case 3:
				System.out.println("WED");		
				break;
				case 4:
				System.out.println("THU");		
				break;
				case 5:
				System.out.println("FRI");		
				break;
				case 6:
				System.out.println("SAT");		
				break;
				case 7:
				System.out.println("SUN");		
				break;
				default:
				System.out.println("请输入正确的数字");
			}
		}
	}
}