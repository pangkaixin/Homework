import java.util.Scanner;

public class Consume
{
	public static void main(String[] args)
	{
		Scanner shuru = new Scanner(System.in);
		System.out.println("Please enter the amount of consumption");//���������ѽ��
		int money = shuru.nextInt();
		if (money >= 50)
		{
			System.out.println("1:Full 50 yuan, plus 2 yuan to buy Pepsi Cola drinks bottles of 1");//��50Ԫ,��2Ԫ�������¿�������1ƿ
			System.out.println("2:Full 100 yuan, plus $3 for the purchase of 500ml cola bottles 1");//��100Ԫ,��3Ԫ����500ml����1ƿ
			System.out.println("3:Full 100 yuan, plus $10 for the purchase of 5 kilograms of flour");//��100Ԫ,��10Ԫ����5�������
			System.out.println("4:Full 200 yuan, plus $10 for the purchase of 1 SUPOR cooking pot");//��200Ԫ,��10Ԫ�ɻ���1���ղ������˹�һ��
			System.out.println("5:Full 200, plus $20 to buy a bottle of L'OREAL toner");//��200,��20Ԫ�ɻ���ŷ����ˬ��ˮһƿ
			System.out.println("6:No exchange");//������
			System.out.println("Please select:");//��ѡ��
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
						System.out.println("monetary" + a);//���ѽ����
						System.out.println("Successful exchange: 1 bottles of pepsi cola drink");//�ɹ�����:1ƿ���¿�������
						break;
					} 
						else
						{
							System.out.println("Lack of consumption, can not buy");//���Ѳ���,�޷�����
							break;
						}
				case 2:
					if (money > 100)
					{
						System.out.println("monetary" + b);//���ѽ����
						System.out.println("Successful exchange: 1 bottles of 500ml cola");//�ɹ�����:1ƿ500ml����
						break;
					} 
						else
						{
							System.out.println("Lack of consumption, can not buy");//���Ѳ���,�޷�����
							break;
						}
					case 3:
						if (money > 100)
						{
							System.out.println("monetary" + c);//���ѽ����
							System.out.println("Successful exchange: 1 packs of 5 kilograms of flour");//�ɹ�����:1��5�������
							break;
						} 
							else
							{
								System.out.println("Lack of consumption, can not buy");//���Ѳ���,�޷�����
								break;
							}
					case 4:
						if (money > 200)
						{
							System.out.println("monetary" + d);//���ѽ����
							System.out.println("Successful exchange: 1 SUPOR wok");//�ɹ�����:1���ղ������˹�һ��
							break;
						} 
							else
							{
								System.out.println("Lack of consumption, can not buy");//���Ѳ���,�޷�����
								break;
							}
					case 5:
						if (money > 200)
						{
							System.out.println("monetary" + e);//���ѽ����
							System.out.println("Successful exchange: 1 bottles of L'OREAL toner");//�ɹ�����:1ƿŷ����ˬ��ˮ
							break;
						} 
							else
							{
							System.out.println("Lack of consumption, can not buy");//���Ѳ���,�޷�����
							break;
							}
					case 0:
					System.out.println("No exchange");//������
					break;
				}
			}
		}
				else
				{
					System.out.println("You don't have permission to change");//��û��Ȩ�޻���
				}
	}
}