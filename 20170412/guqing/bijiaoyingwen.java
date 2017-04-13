package ื๗าต;

public class bijiaoyingwen {
	public static String[] str = { "c", "b", "z", "a", "f" };
	public static String temp;

	public static void main(String[] args) {
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length - 1; j++) {
				if (str[j].compareTo(str[j + 1]) > 0) {
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
