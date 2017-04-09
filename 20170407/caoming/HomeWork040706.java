import java.util.Scanner;
public class HomeWork040706
{
		public static void main(String[] args)
		{
				Scanner sc=new Scanner(System.in);
				System.out.print("please enter the soce:");
				double score=sc.nextDouble();
				if(score==100)
				{
					System.out.print("get a car");
				}
				else if(score<100&&score>=90)
				{
					System.out.print("get a computer");
				}
				else if(score<90&&score>=60)
				{
					System.out.print("get a phone");
				}
				else if(score<60&&score>=0)
		    {
		     	System.out.print("have no gift");
		    }
		    else
		    {
		    	System.out.print("please enter the right score!");
		    }
		
		}


}