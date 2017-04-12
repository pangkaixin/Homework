
public class ArraySorto
{
	public static void main(String[] args)
	{
		char[] a =
		{ 'g', 'f', 'd', 's', 'a', 'h', 'j', 'k', 'l' };
		for (int i = 1; i < a.length; i++)
		{
			for (int j = 0; j < a.length - i; j++)
			{
				if (a[j] > a[j + 1])
				{
					char temp = a[j];
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
