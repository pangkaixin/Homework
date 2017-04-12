import java.util.Scanner;

public class EnglishSort
{
	public static void main(String[] args)
	{
		Scanner sc = null;
		String[] englishArr = new String[5];
		System.out.println("请在数组中输入英文");
		for (int i = 0; i < englishArr.length; i++)
		{
			sc = new Scanner(System.in);
			englishArr[i] = sc.next();
		}
		for (int j = 1; j <= englishArr.length; j++)
		{
			for (int i = 0; i < englishArr.length - 1; i++)
			{
				if (englishArr[i].compareTo(englishArr[i + 1]) > 0)
				{
					String temp = englishArr[i];
					englishArr[i] = englishArr[i + 1];
					englishArr[i + 1] = temp;
				}
			}

		}
		for (int i = 0; i < englishArr.length - 1; i++)
		{
			System.out.print(englishArr[i] + " ");
		}
	}
}