//��֤�����Ƿ�ɹ�
import java.util.Scanner;
public class HomeWork040701
{
		public static void main(String[] args)
		{
				String loginName="caoming@cheer.com";
				String password="123456789";
				Scanner sc=new Scanner(System.in);
				System.out.print("�������û���:");
				String name=sc.next();
				System.out.print("�������������:");
				String pw=sc.next();
					if((loginName).equals(name)&&(password).equals(pw))
					{
          	System.out.print("����ɹ�");	
					}
				  else
				  {
				  	System.out.print("����ʧ�ܣ������������ϵ����");
				  }
		}

}