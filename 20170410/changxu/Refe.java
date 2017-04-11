import java.util.Scanner;
public class Refe
{
	public static void main(String[] args)
	{
		  System.out.println("请输入数字：");
			Scanner sc=new Scanner(System.in);	
			String str;
		do
		{
			int day=sc.nextInt();
			switch(day)
			{
				case 1:{
					     System.out.println("Mon");
					     break;
					     }
				case 2:{
					     System.out.println("Tues");
					     break;
					     }
			  case 3:{
					     System.out.println("Wednes");
					     break;
					     }
			  case 4:{
					     System.out.println("Thurs");
					     break;
					     }
				case 5:{
					     System.out.println("Fri");
					     break;
					     }
				case 6:{
					     System.out.println("Satur");
					     break;
					     }
				case 7:{
					     System.out.println("Sun");
					     break;
					     }
			}
		System.out.println("\n继续输入吗(y/n)?");
    str=sc.next();        
    }while(str.equals("y"));
      	System.out.println("程序结束");		
	  }
}
//数字
//英文星期名称