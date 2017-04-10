import java.util.Scanner;
public class HomeWork040703
{
		public static void main(String[] args)
		{
				Scanner sc=new Scanner(System.in);
				System.out.print("first number:");
				int a=sc.nextInt();
        System.out.print("second number:");
				int b=sc.nextInt();
				System.out.print("three number:");
				int c=sc.nextInt();
				int temp1;
				int temp2;
				int temp3;
//					if(a<b&&b<c)
//					{
//							temp1=a;
//							a=c;
//							c=temp1;
//						
//					}
//					else if(a<b&&b>c&&a<c)
//					{
//						
//						temp1=a;
//						temp2=c;
//						a=b;
//						b=temp2;
//						c=temp1;
//						
//					}
//					else if(a>b&&a<c&&b<c)
//					{
//            temp1=a;
//						temp2=b;
//						a=c;
//						b=temp1;
//						c=temp2;
//            
//					}
//					else if(a>b&&a>c&&b<c)
//					{
//            temp1=b;
//            b=c;
//            c=temp1;
//
//					}
//					else if(a<b&&a>c&&b>c)
//					{
//            temp1=a;
//            a=b;
//            b=temp1;
//					}
					if(a<b)
					{
						temp1=a;
						a=b;
						b=temp1;
						
						}
					 if(a<c)
					{
						temp3=a;
						a=c;
						c=temp3;
					}
					 if(b<c)
					{
						temp2=b;
						b=c;
						c=temp2;
						
					}
					
				
					System.out.print(a+"\t"+b+"\t"+c);
		}


}