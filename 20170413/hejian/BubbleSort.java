
public class BubbleSort
{
	public static void main(String[] args)
	{
		int[] a =
		{ 11, 22, 33, 44, 99, 88, 77, 66, 55 };// 第一次循环结束：11 22 33 44 88 77 66
												// 55 99(取出最大值)
		for (int i = 1; i < a.length; i++)// 第二次循环结束：11 22 33 44 77 66 55 88
											// 99(依次把数值大的往后排）
		{									// 第三次循环结束：11 22 33 44 66 55 77 88 99
			for (int j = 0; j < a.length - i; j++)// 第四次循环结束: 11 22 33 44 55 66
													// 77 88 99
			{
				int team = 0;
				if (a[j] > a[j + 1])
				{
					team = a[j];
					a[j] = a[j + 1];
					a[j + 1] = team;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + "\t");
		}
	}
}
