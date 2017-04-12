public class MaoPaoSorty
{
	public static void main(String[] args)
	{
		int[] arr =
		{ 98, 65, 70, 85, 77 };
		int temp = 0;
		for (int j = 1; j <= arr.length; j++)
		{
			for (int i = 0; i < arr.length - 1; i++)
			{
				if (arr[i] > arr[i + 1])
				{
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}