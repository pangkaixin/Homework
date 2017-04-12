/**
*外层循环控制行，内存循环控制列。
**/
import java.util.Scanner;
public class InPut
{
	public static void main(String[] args)
	{
		Scanner	sc=null;
		System.out.println("1.长方形 2.正方形 3.三角形 4.平行四边形 5.菱形 6.乘法口诀表");
		for(int i=1;i<=6;i++)
		{
			sc=new Scanner(System.in);
			System.out.println("请选择图形编号：");
		   int graphNo=sc.nextInt();		   
			switch(graphNo)
			{
				case 2:
				{
					int l=5;
					String res="*";
					for(int a=1;a<=l;a++)
					{
						for(int b=1;b<=l-1;b++)
						{
							System.out.print(res+" ");				
						}
						System.out.println(res);
					}
					break;
				}
				case 1:
				{
					int lo=10;
					int wide=5;
					String red="*";
					for(int a=1;a<=wide;a++)
					{
						for(int b=1;b<=lo-1;b++)
						{
							System.out.print(red+" ");				
						}
						System.out.println(red);
					}
					break;
				}
				case 3:
				{
					String ret="*";
					String str=" ";	
					for(int a=0;a<=4;a++)
					{
						String ste=" ";
						for(int b=1;b<=9;b++)
						{
							if(a==4||b==5-a||b==5+a)
							{
								ste+=ret;
							}else
							{
							ste+=str;
							}				
						}
					System.out.println(ste);
					}
					break;	
				}
				case 4:
				{
					for (int c = 1; c <=5; c++)
					{
            		for (int d = 1; d <= 5 - c; d++) 
            		{
                		System.out.print(" ");
            		}
            		for (int k = 1; k <= 5; k++) 
            		{
               		System.out.print("*");
            		}
            			System.out.println();
       		 	}
       		 	break;
				}
				case 5:
				{
					for(int e=0;e<=5;e++)
					{
						for(int f=0;f<5-e;f++)
						{
							System.out.print(" ");
						}
						for(int x=0;x<=e;x++)
						{
							System.out.print("* ");
						}
						System.out.println();
					}

					for(int o=0;o<=4;o++)
					{
						for(int p=4;p>=4-o;p--)
						{
							System.out.print(" ");
						}
						for(int q=4;q>=o;q--)
						{
							System.out.print("* ");
						}
							System.out.println();
					}
					break;
				}
				case 6:
				{
					for(int n=1;n<=9;n++)
					{
						for(int m=1;m<=n;m++)
						{
							System.out.print(m+"*"+n+"="+m*n+" ");	
						}
		  			System.out.println();
	   			}
	   			break;
				}
				
		   }
		   System.out.println("请问是否继续输出：(y/n)");
		   String str=sc.next();
		   if("n".equals(str))
		   {
		   	System.out.println("结束输入");
		   	break;
		   }		   	
		}
		sc.close();
	}
}