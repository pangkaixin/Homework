import java.util.Scanner;
public class Entry//���
{
	public static void main(String[] args)
	{
		Scanner shuru=new Scanner(System.in);
		System.out.println("Please enter your username");//����������û���
		String amd1=shuru.next();
		System.out.println("Enter the password");//�������������
		String password1=shuru.next();
		String a="heyuming";
		String p="heyuming";
		if(a.equals(amd1))
		{
			if(p.equals(password1))
			{	
				System.out.println("login successful");//��¼�ɹ�
			}
			else
			{
				System.out.println("Login fail");//��¼ʧ��
			}
		}
	}
}