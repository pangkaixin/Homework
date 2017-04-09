import java.util.Scanner;
public class HomeWork040705
{
		public static void main(String[] args)
		{
				Scanner sc=new Scanner(System.in);
				System.out.print("day of the week:");
				String day=sc.next();
				switch(day)
				{
						case "monday":
									System.out.print("learn JAVA");	
									break;
					  case "tuesday":
									System.out.print("learn English");	
									break;
						case "wendnesday":
									System.out.print("learn JAVA");	
									break;
						case "thursday":
									System.out.print("learn English");	
									break;		
						case "friday":
									System.out.print("learn JAVA");	
									break;			
						case "saturday":
									System.out.print("learn English");	
									break;			
						case "sunday":
									System.out.print("have a rest");	
									break;	
				    default:
				          System.out.print("you enter wrong");
				}
				
		
		
		}


}