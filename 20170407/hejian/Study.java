import java.util.Scanner;
public class Study
{
	public static void main(String[] args)
	{
		Scanner shuru=new Scanner(System.in);
		System.out.println("Please enter a date");//请输入日期
		int week=shuru.nextInt();
		switch(week)
		{
			case 1:
			System.out.println("Learning programming today");//今天学习编程
			break;
			case 2:
			System.out.println("Learn English today");//今天学习英语
			break;
			case 3:
			System.out.println("Learning programming today");	//今天学习编程
			break;
			case 4:
			System.out.println("Learn English today");//今天学习英语
			break;
			case 5:
			System.out.println("Learning programming today");	//今天学习编程
			break;
			case 6:
			System.out.println("Learn English today");//今天学习英语
			break;
			case 7:
			System.out.println("Today is a day off");//今天休息
			break;
			default:
			System.out.println("Input is incorrect, please enter the correct");//请输入正确的信息
			break;
		}
	}
}