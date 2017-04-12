
public class ArraySorts
{
	public static void main(String[] args)
	{
		int[] a =
		{ 90, 85, 60, 69, 82, 91 };
		for (int i = 1; i < a.length; i++)
		{
			for (int j = 0; j < a.length - i; j++)
			{
				if (a[j] > a[j + 1])
				{
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + "\t");
		}
	}
}
