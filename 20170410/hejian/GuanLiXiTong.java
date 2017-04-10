import java.util.Scanner;
public class GuanLiXiTong
{
	public static void main(String[] args)
	{
		System.out.println("MyShopping管理系统 ,购物结算");
		System.out.println("***********************");
		System.out.println("请选择你购买的商品编号：\n1：T桖\t2：网球鞋\t3：网球拍");
		System.out.println("***********************");
		boolean isBuy=true;
		while(isBuy)
		{
			Scanner shuru=new Scanner(System.in);
			System.out.println("请输入商品编号：");
			int a=shuru.nextInt();
			switch(a)
			{
				case 1:
				System.out.println("T桖\t￥200");
				break;
				case 2:
				System.out.println("网球鞋\t￥300");
				break;
				case 3:
				System.out.println("网球拍\t￥100");
				break;
			}
		
		System.out.println("是否继续y/n");
		String b=shuru.next();
		if("n".equals(b))
		{
				isBuy=false;
		}
		}
		System.out.println("程序结束");
	}
}