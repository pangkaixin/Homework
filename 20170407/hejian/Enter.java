import java.util.Scanner;
public class Enter//数字排序
{
	public static void main(String[] args)
	{
		Scanner shuru=new Scanner(System.in);
		System.out.println("Please enter three numbers");//请输入三个数字
		int one=shuru.nextInt();
		int two=shuru.nextInt();
		int three=shuru.nextInt();
		if(one<two)
		{
			int four=one;
			one=two;
			two=four;
		}
			if(one<three)
			{
				int five=one;
				one=three;
				three=five;
			}
				if(two<three)
				{
					int sex=two;
					two=three;
					three=sex;	
				}		
		System.out.println("From big to small order:"+one+" "+two+" "+three);//这三个数从大到小排序为
	}
}