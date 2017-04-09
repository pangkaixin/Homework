import java.util.Scanner;

public class Consume
{
	public static void main(String[] args)
	{
		Scanner shuru = new Scanner(System.in);
		System.out.println("Please enter the amount of consumption");//请输入消费金额
		int money = shuru.nextInt();
		if (money >= 50)
		{
			System.out.println("1:Full 50 yuan, plus 2 yuan to buy Pepsi Cola drinks bottles of 1");//满50元,加2元换购百事可乐饮料1瓶
			System.out.println("2:Full 100 yuan, plus $3 for the purchase of 500ml cola bottles 1");//满100元,加3元换购500ml可乐1瓶
			System.out.println("3:Full 100 yuan, plus $10 for the purchase of 5 kilograms of flour");//满100元,加10元换购5公斤面粉
			System.out.println("4:Full 200 yuan, plus $10 for the purchase of 1 SUPOR cooking pot");//满200元,加10元可换购1个苏泊尔炒菜锅一个
			System.out.println("5:Full 200, plus $20 to buy a bottle of L'OREAL toner");//满200,加20元可换购欧莱雅爽肤水一瓶
			System.out.println("6:No exchange");//不换购
			System.out.println("Please select:");//请选择
			int a=money+2;
			int b=money+3;
			int c=money+10;
			int d=money+10;
			int e=money+20;
			if (shuru.hasNextInt())
			{
			int buy = shuru.nextInt();
				switch (buy)
				{
				case 1:
					if (money > 50)
					{
						System.out.println("monetary" + a);//消费金额是
						System.out.println("Successful exchange: 1 bottles of pepsi cola drink");//成功换购:1瓶百事可乐饮料
						break;
					} 
						else
						{
							System.out.println("Lack of consumption, can not buy");//消费不足,无法换购
							break;
						}
				case 2:
					if (money > 100)
					{
						System.out.println("monetary" + b);//消费金额是
						System.out.println("Successful exchange: 1 bottles of 500ml cola");//成功换购:1瓶500ml可乐
						break;
					} 
						else
						{
							System.out.println("Lack of consumption, can not buy");//消费不足,无法换购
							break;
						}
					case 3:
						if (money > 100)
						{
							System.out.println("monetary" + c);//消费金额是
							System.out.println("Successful exchange: 1 packs of 5 kilograms of flour");//成功换购:1包5公斤面粉
							break;
						} 
							else
							{
								System.out.println("Lack of consumption, can not buy");//消费不足,无法换购
								break;
							}
					case 4:
						if (money > 200)
						{
							System.out.println("monetary" + d);//消费金额是
							System.out.println("Successful exchange: 1 SUPOR wok");//成功换购:1个苏泊尔炒菜锅一个
							break;
						} 
							else
							{
								System.out.println("Lack of consumption, can not buy");//消费不足,无法换购
								break;
							}
					case 5:
						if (money > 200)
						{
							System.out.println("monetary" + e);//消费金额是
							System.out.println("Successful exchange: 1 bottles of L'OREAL toner");//成功换购:1瓶欧莱雅爽肤水
							break;
						} 
							else
							{
							System.out.println("Lack of consumption, can not buy");//消费不足,无法换购
							break;
							}
					case 0:
					System.out.println("No exchange");//不换购
					break;
				}
			}
		}
				else
				{
					System.out.println("You don't have permission to change");//你没有权限换购
				}
	}
}