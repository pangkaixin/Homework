import java.util.Scanner;
public class HomeWork040702
{
		public static void main(String[] args)
		{
				Scanner sc=new Scanner(System.in);
				System.out.print("boy or girl£º");
				String sex=sc.next();
				System.out.print("how old£º");
				int age=sc.nextInt();
				  if(("boy").equals(sex)&&(age>=5))
				  {
				  		System.out.print("you can move the chair");
				  }
		      else if(age>=7)
		      {
		      	  System.out.print("you can move the chair");
		      }
		      else
		      {
		      		System.out.print("go home and drink milk");		
		   		}
		}


}