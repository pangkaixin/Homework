import java.util.Scanner;
public class Chair//����
{
	public static void main(String[] args)
	{
		Scanner shuru=new Scanner(System.in);
		System.out.println("Is not a boy ");//�ǲ����к�
		String isBoy=shuru.next();
		System.out.println("Please enter your age");//�������������
		int age=shuru.nextInt();
		if("y".equals(isBoy))
		{
			if(age>5)
			{
			System.out.println("Please move the chair");	//�������
			}
			else
			{
			System.out.println("Children can not move");	//С���Ѳ����԰�
			}
		}
		else if(age>7)
		{
			System.out.println("Please move the chair");//�������
		}
		else
		{
			System.out.println("You can't move, please grow up and move again");	//�㲻�ܰᣬ�볤����������	
		}
	}
}