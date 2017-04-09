import java.util.Scanner;
public class Chair//椅子
{
	public static void main(String[] args)
	{
		Scanner shuru=new Scanner(System.in);
		System.out.println("Is not a boy ");//是不是男孩
		String isBoy=shuru.next();
		System.out.println("Please enter your age");//请输入你的年龄
		int age=shuru.nextInt();
		if("y".equals(isBoy))
		{
			if(age>5)
			{
			System.out.println("Please move the chair");	//请搬椅子
			}
			else
			{
			System.out.println("Children can not move");	//小朋友不可以搬
			}
		}
		else if(age>7)
		{
			System.out.println("Please move the chair");//请搬椅子
		}
		else
		{
			System.out.println("You can't move, please grow up and move again");	//你不能搬，请长大了再来搬	
		}
	}
}