import java.util.Scanner;
public class Shoppingsettlement
{
	public static void main(String[] args)
	{
		System.out.println("MyShopping����ϵͳ ,�������");
		System.out.println("***********************");
		System.out.println("��ѡ���㹺�����Ʒ��ţ�\n1��T��\t2������Ь\t3��������");
		System.out.println("***********************");
		boolean isBuy=true;
		int shirt=200;
		int shose=300;
		int recket=100;
		while(isBuy)
		{
			Scanner shuru=new Scanner(System.in);
			System.out.println("��������Ʒ��ţ�");
			int a=shuru.nextInt();
			System.out.println("�����빺��������");
			int b=shuru.nextInt();
			double tx=shirt*b;
			double qx=shose*b;
			double qp=recket*b;
			switch(a)
				{
					case 1:
					System.out.println("T��\t��200");
					System.out.println("����"+b);
					System.out.println("�ϼ�"+tx);
					break;
					case 2:
					System.out.println("����Ь��300");
					System.out.println("����"+b);
					System.out.println("�ϼ�"+qx);
					break;
					case 3:
					System.out.println("�����ģ�100");
					System.out.println("����"+b);
					System.out.println("�ϼ�"+qp);
					break;
				}
					System.out.println("�Ƿ����y/n");
					String bh=shuru.next();
					double	c1=tx*0.8;
					double c2=qx*0.8;
					double	c3=qp*0.8;
					if("y".equals(bh))
				{
					isBuy=true;
					System.out.println("�ۿۣ�"+0.8);
					if(a==1)
				{
					System.out.println("Ӧ����"+c1);
				}//
					else if(a==2)
				{
					System.out.println("Ӧ����"+c2+"+"+c1);	
					System.out.println("ʵ�����Ϊ");
					int d=shuru.nextInt();
					double w=d-c2-c1;
					System.out.println("���㣺"+w);
				}//
					else if(a==3)
				{
					System.out.println("Ӧ����"+c3+"+"+c2+"+"+c1);
					System.out.println("ʵ�����Ϊ");
					int e=shuru.nextInt();
					double f=e-c1-c2-c3;
					System.out.println("���㣺"+f);
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
					System.out.println("Ӧ����"+c1);
					System.out.println("ʵ�����Ϊ");
					int c=shuru.nextInt();
					double q=c-c1;
					System.out.println("���㣺"+q);
				}
					 if(a==2)
				{
					System.out.println("Ӧ����"+c2);	
					System.out.println("ʵ�����Ϊ");
					int d=shuru.nextInt();
					double w=d-c2;
					System.out.println("���㣺"+w);
				}
					if(a==3)
				{
					System.out.println("Ӧ����"+c3);
					System.out.println("ʵ�����Ϊ");
					int e=shuru.nextInt();
					double f=e-c3;
					System.out.println("���㣺"+f);	
				}
				}
		}
			System.out.println("�������");
	}
}