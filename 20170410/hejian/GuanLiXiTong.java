import java.util.Scanner;
public class GuanLiXiTong
{
	public static void main(String[] args)
	{
		System.out.println("MyShopping����ϵͳ ,�������");
		System.out.println("***********************");
		System.out.println("��ѡ���㹺�����Ʒ��ţ�\n1��T��\t2������Ь\t3��������");
		System.out.println("***********************");
		boolean isBuy=true;
		while(isBuy)
		{
			Scanner shuru=new Scanner(System.in);
			System.out.println("��������Ʒ��ţ�");
			int a=shuru.nextInt();
			switch(a)
			{
				case 1:
				System.out.println("T��\t��200");
				break;
				case 2:
				System.out.println("����Ь\t��300");
				break;
				case 3:
				System.out.println("������\t��100");
				break;
			}
		
		System.out.println("�Ƿ����y/n");
		String b=shuru.next();
		if("n".equals(b))
		{
				isBuy=false;
		}
		}
		System.out.println("�������");
	}
}