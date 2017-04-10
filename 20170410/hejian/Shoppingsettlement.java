import java.util.Scanner;
public class Shoppingsettlement
{
	public static void main(String[] args)
	{
		System.out.println("MyShopping管理系统 ,购物结算");
		System.out.println("***********************");
		System.out.println("请选择你购买的商品编号：\n1：T桖\t2：网球鞋\t3：网球拍");
		System.out.println("***********************");
		boolean isBuy=true;
		int shirt=200;
		int shose=300;
		int recket=100;
		while(isBuy)
		{
			Scanner shuru=new Scanner(System.in);
			System.out.println("请输入商品编号：");
			int a=shuru.nextInt();
			System.out.println("请输入购买数量：");
			int b=shuru.nextInt();
			double tx=shirt*b;
			double qx=shose*b;
			double qp=recket*b;
			switch(a)
				{
					case 1:
					System.out.println("T桖\t￥200");
					System.out.println("数量"+b);
					System.out.println("合计"+tx);
					break;
					case 2:
					System.out.println("网球鞋￥300");
					System.out.println("数量"+b);
					System.out.println("合计"+qx);
					break;
					case 3:
					System.out.println("网球拍￥100");
					System.out.println("数量"+b);
					System.out.println("合计"+qp);
					break;
				}
					System.out.println("是否继续y/n");
					String bh=shuru.next();
					double	c1=tx*0.8;
					double c2=qx*0.8;
					double	c3=qp*0.8;
					if("y".equals(bh))
				{
					isBuy=true;
					System.out.println("折扣："+0.8);
					if(a==1)
				{
					System.out.println("应付金额："+c1);
				}//
					else if(a==2)
				{
					System.out.println("应付金额："+c2+"+"+c1);	
					System.out.println("实付金额为");
					int d=shuru.nextInt();
					double w=d-c2-c1;
					System.out.println("找零："+w);
				}//
					else if(a==3)
				{
					System.out.println("应付金额："+c3+"+"+c2+"+"+c1);
					System.out.println("实付金额为");
					int e=shuru.nextInt();
					double f=e-c1-c2-c3;
					System.out.println("找零："+f);
				}//	
						else
				{
					System.out.println();
				//}
				//}
				//}
				}	
				}
					if("n".equals(bh))
				{
					isBuy=false;
					if(a==1)
				{
					System.out.println("应付金额："+c1);
					System.out.println("实付金额为");
					int c=shuru.nextInt();
					double q=c-c1;
					System.out.println("找零："+q);
				}
					 if(a==2)
				{
					System.out.println("应付金额："+c2);	
					System.out.println("实付金额为");
					int d=shuru.nextInt();
					double w=d-c2;
					System.out.println("找零："+w);
				}
					if(a==3)
				{
					System.out.println("应付金额："+c3);
					System.out.println("实付金额为");
					int e=shuru.nextInt();
					double f=e-c3;
					System.out.println("找零："+f);	
				}
				}
		}
			System.out.println("程序结束");
	}
}