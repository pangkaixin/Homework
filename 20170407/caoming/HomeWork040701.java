//验证登入是否成功
import java.util.Scanner;
public class HomeWork040701
{
		public static void main(String[] args)
		{
				String loginName="caoming@cheer.com";
				String password="123456789";
				Scanner sc=new Scanner(System.in);
				System.out.print("请输入用户名:");
				String name=sc.next();
				System.out.print("请输入登入密码:");
				String pw=sc.next();
					if((loginName).equals(name)&&(password).equals(pw))
					{
          	System.out.print("登入成功");	
					}
				  else
				  {
				  	System.out.print("登入失败，如需帮助请联系曹明");
				  }
		}

}