import java.util.Scanner;
public class Study
{
	public static void main(String[] args)
	{
		Scanner shuru=new Scanner(System.in);
		System.out.println("Please enter a date");//����������
		int week=shuru.nextInt();
		switch(week)
		{
			case 1:
			System.out.println("Learning programming today");//����ѧϰ���
			break;
			case 2:
			System.out.println("Learn English today");//����ѧϰӢ��
			break;
			case 3:
			System.out.println("Learning programming today");	//����ѧϰ���
			break;
			case 4:
			System.out.println("Learn English today");//����ѧϰӢ��
			break;
			case 5:
			System.out.println("Learning programming today");	//����ѧϰ���
			break;
			case 6:
			System.out.println("Learn English today");//����ѧϰӢ��
			break;
			case 7:
			System.out.println("Today is a day off");//������Ϣ
			break;
			default:
			System.out.println("Input is incorrect, please enter the correct");//��������ȷ����Ϣ
			break;
		}
	}
}