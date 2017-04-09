import java.util.Scanner;
public class HomeWork040704
{
		public static void main(String[] args)
		{
				Scanner sc=new Scanner(System.in);
				System.out.print("the original price is:");
				double price=sc.nextDouble();
				System.out.print("travel in:");
		    int month=sc.nextInt();
		    System.out.print("1:tourist class;2:first-class.");
		    int type=sc.nextInt();
					
					if(type==1)
					{
							if(4<=month&&month<=10)
							{
									System.out.print("discounted price is: " +price*0.75);
							}
							else
							{
									System.out.print("discounted price is: " +price*0.3);
							}
					
					
					}
					else if(type==2)
					{
					
						if(4<=month&&month<=10)
								{
										System.out.print("discounted price is: " +price*0.9);
								}
								else
								{
										System.out.print("discounted price is: " +price*0.6);
								}
						
					
					}
		
		}


}