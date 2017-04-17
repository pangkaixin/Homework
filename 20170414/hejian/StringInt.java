import java.util.Scanner;

public class StringInt
{
	// 给定一个由数字组成的字符串，统计出每个数字出现的次数
	public static void main(String[] args)
	{
		String str = "123456789987654321123456789";
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查找的数字：");
		String number = sc.next();
		int j = 0;
		for (int i = 0; i < str.length(); i++)
		{
			String newstr = str.substring(i, i + 1);
			if (number.equals(newstr))
			{
				j = j + 1;
			}
		}
		System.out.println(j);
		sc.close();
	}
}
