import java.util.Scanner;
public class HomeWork040708
{
	
	
	public static void main(String[] args)
	{
				Scanner sc=new Scanner(System.in);
				System.out.print("请输入消费金额:");
				int money=sc.nextInt();
        System.out.println("1:满50元，加2元换购百事可乐一瓶");
				System.out.println("2:满100元，加3元换购300ml可乐一瓶");
				System.out.println("3:满100元，加10元换购5公斤面粉");
				System.out.println("4:满200元，加10元换购苏泊尔炒锅");
				System.out.println("5:满200元，加20元换购欧莱雅爽肤水");
				System.out.println("0:不换购");
				if(money<50)
				{
					System.out.println("本次消费总金额："+money);
					System.out.println("对不起您不合符换购条件，谢谢光临");
		  	}
				else{
				
				
				Scanner input=new Scanner(System.in);
				System.out.print("请选择:");
				int chose=input.nextInt();
				
				if (money>=500)
				{
					switch (chose)
					{
						case 4:
						  System.out.println("本次消费总金额："+(money+10));
						  System.out.println("成功换购：一个苏泊尔炒锅");
						  break;
						case 5:
						  System.out.println("本次消费总金额："+(money+20));
						  System.out.println("成功换购：欧莱雅爽肤水");
						  break;
						case 0:
						  System.out.println("本次消费总金额："+money);
						  System.out.println("不换购");
						  break;
						default:
            	System.out.println("输入有误");
					}
					
				}
				else if(money>=100)
				{
				   switch (chose)
					{
						case 2:
						  System.out.println("本次消费总金额："+(money+3));
						  System.out.println("成功换购：300ml可乐");
						  break;
						case 3:
						  System.out.println("本次消费总金额："+(money+10));
						  System.out.println("成功换购：5公斤面粉");
						  break;
						case 0:
						  System.out.println("本次消费总金额："+money);
						  System.out.println("不换购");
						  break;
						default:
            	System.out.println("输入有误 ");
					}
				}
				else if(money>=50)
				{
					switch (chose)
					{
						case 1:
						  System.out.println("本次消费总金额："+(money+3));
						  System.out.println("成功换购：百事可乐");
						  break;
						
						case 0:
						  System.out.println("本次消费总金额："+money);
						  System.out.println("不换购");
						  break;
						default:
            	System.out.println("输入有误 ");
					}
				
				}
				
				
		}
	}
}