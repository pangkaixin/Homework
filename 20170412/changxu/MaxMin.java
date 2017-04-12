public class MaxMin
{
	public static void main(String[] args)
	{
		int max, min;
		int[] a =
		{ 10, 8, 200, 98, 46, 12, 1 };
		min = a[0];
		max = a[0];
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}

		}
		System.out.println("max:" + max);
		System.out.println("min:" + min);

	}
}