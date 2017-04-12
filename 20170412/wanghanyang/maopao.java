package learnJDBC;

public class maopao {
	public static void main(String args[]) {
		int[] a = { 4, 1, 5, 6, 67, 87, 98, 8, 2, 9, 3, 107 };
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int k = 0; k < a.length; k++) {

			System.out.print(a[k] + " ");

		}
	}
}