import java.util.Scanner;
public class Enter//��������
{
	public static void main(String[] args)
	{
		Scanner shuru=new Scanner(System.in);
		System.out.println("Please enter three numbers");//��������������
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
		System.out.println("From big to small order:"+one+" "+two+" "+three);//���������Ӵ�С����Ϊ
	}
}