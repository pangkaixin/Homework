import java.util.Scanner;

public class HomeWork041001
{	
	public static void main(String[] args)//PPT TOP05  25页  查询商品价格
	{     
		System.out.println("********************************************");    
		System.out.println("my shopping system");
		System.out.println("1.T桖   2.网球鞋  3.网球拍");
		System.out.println("********************************************\n");
		boolean isbuy=true;

		while(isbuy)
		{
					
			Scanner sc=new Scanner(System.in);
			System.out.print("请输入商品编号：");
			int nub=sc.nextInt();
			switch(nub)
			{
				case 1:
					System.out.println("1.T桖    250");
					break;
				case 2:
					System.out.println("2网球鞋    300");
		            break;
				case 3:
					System.out.println("3.网球拍    600");	
					break;
				default:
					System.out.println("请输入正确编号");
			} 
							    
			System.out.println("是否继续（y/n）");
			String choice=sc.next();	
					    
			if(!"y".equals(choice))
			{
				isbuy=false;
			}			
		}		
				
		System.out.println("购物结束！");
		
		}
}