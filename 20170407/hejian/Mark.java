import java.util.Scanner;
public class Mark//�ɼ�
{
	public static void main(String[] args)
	{
		Scanner shuru=new Scanner(System.in);
		System.out.println("Please enter your score");//��������ķ���
		int mark=shuru.nextInt();
		if(mark==100)
		{
			System.out.println("Give you a car as a gift");//����һ������Ϊ����
		}
		else if(mark>=90)
		{
			System.out.println("Send you a laptop");	//����һ̨�ʼǱ�����
		}
		else if(mark>60)
		{
			System.out.println("Send you a cell phone");//����һ���ֻ�
		}
		else if(mark<=60&&mark>=0)
		{
			System.out.println("No gifts, good effort");	//û������ú�Ŭ��
		}
		else
		{
			System.out.println("You entered the wrong results, please enter the correct results");	//������ĳɼ�������������ȷ�ĳɼ�
		}
	}
}