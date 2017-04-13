
public class InsertionSort
{
	public static void main(String[] args)
	{
		int[] a =
		{ 4, 3, 7, 5, 9, 6, 1 };
		insertionSort(a);
		for (int i : a)
		{
			System.out.print(i + "\t");
		}
	}

	public static void insertionSort(int[] a)
	{
		int i, j;
		int n = a.length;
		int target; // 原始数组元素为：4 3 7 5 9 6 1
		for (i = 1; i < n; i++) // 第一次循环结束: 3 4 7 5 9 6 1(坐标1和0比较)
		{ // 第二次循环结束：3 4 7 5 9 6 1
			j = i; // 第三次循环结束：3 4 5 7 9 6 1
			target = a[i]; // 第四次循环结束：3 4 5 7 9 6 1
			while (j > 0 && target < a[j - 1]) // 第五次循环结束：3 4 5 7 6 9 1
			{ // 3 4 5 6 7 9 1
				a[j] = a[j - 1]; // 第六次循环结束：3 4 5 6 7 1 9
				j--; // 3 4 5 6 1 7 9
			} // 3 4 5 1 6 7 9
			a[j] = target; // 3 4 1 5 6 7 9
		} // 3 1 4 5 6 7 9
	} // 1 3 4 5 6 7 9
}
