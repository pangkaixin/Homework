import java.util.Scanner;
public class HomeWork040708
{
	
	
	public static void main(String[] args)
	{
				Scanner sc=new Scanner(System.in);
				System.out.print("���������ѽ��:");
				int money=sc.nextInt();
        System.out.println("1:��50Ԫ����2Ԫ�������¿���һƿ");
				System.out.println("2:��100Ԫ����3Ԫ����300ml����һƿ");
				System.out.println("3:��100Ԫ����10Ԫ����5�������");
				System.out.println("4:��200Ԫ����10Ԫ�����ղ�������");
				System.out.println("5:��200Ԫ����20Ԫ����ŷ����ˬ��ˮ");
				System.out.println("0:������");
				if(money<50)
				{
					System.out.println("���������ܽ�"+money);
					System.out.println("�Բ��������Ϸ�����������лл����");
		  	}
				else{
				
				
				Scanner input=new Scanner(System.in);
				System.out.print("��ѡ��:");
				int chose=input.nextInt();
				
				if (money>=500)
				{
					switch (chose)
					{
						case 4:
						  System.out.println("���������ܽ�"+(money+10));
						  System.out.println("�ɹ�������һ���ղ�������");
						  break;
						case 5:
						  System.out.println("���������ܽ�"+(money+20));
						  System.out.println("�ɹ�������ŷ����ˬ��ˮ");
						  break;
						case 0:
						  System.out.println("���������ܽ�"+money);
						  System.out.println("������");
						  break;
						default:
            	System.out.println("��������");
					}
					
				}
				else if(money>=100)
				{
				   switch (chose)
					{
						case 2:
						  System.out.println("���������ܽ�"+(money+3));
						  System.out.println("�ɹ�������300ml����");
						  break;
						case 3:
						  System.out.println("���������ܽ�"+(money+10));
						  System.out.println("�ɹ�������5�������");
						  break;
						case 0:
						  System.out.println("���������ܽ�"+money);
						  System.out.println("������");
						  break;
						default:
            	System.out.println("�������� ");
					}
				}
				else if(money>=50)
				{
					switch (chose)
					{
						case 1:
						  System.out.println("���������ܽ�"+(money+3));
						  System.out.println("�ɹ����������¿���");
						  break;
						
						case 0:
						  System.out.println("���������ܽ�"+money);
						  System.out.println("������");
						  break;
						default:
            	System.out.println("�������� ");
					}
				
				}
				
				
		}
	}
}