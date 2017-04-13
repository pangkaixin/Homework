package ื๗าต;

public class maopao {
	public static int[] str = { 4, 5, 7, 9, 2, 1, 19, 3 };
	public static int temp;

	public static void main(String[] args) {
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length - 1; j++) {
				if (str[j + 1] > str[j]) {
					temp = str[j + 1];
					str[j + 1] = str[j];
					str[j] = temp;
				}

			}
		}
		for (int k = 0; k < str.length; k++) {
			System.out.print(str[k] + "  ");
		}

	}

}
