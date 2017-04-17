import java.util.Scanner;

public class Stringobtain
{
	// 获取一个字符串在另一个字符串中出现的次数
	public static void main(String[] args)
	{
		String str = "123456789987654321123456789";
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String newstring = sc.next();
		for (String tmp = str; tmp != null && tmp.length() >= newstring.length();)
		{
			if (tmp.indexOf(newstring) == 0)
			{
				total++;
			}
			tmp = tmp.substring(1);
		}
		System.out.println(total);
	}
}
