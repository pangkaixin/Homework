package ื๗าต;

public class bijiaomaxandmin {
	public static int[] str = { 5, 8, 63, 4, 6, 7, 54, 9, 10, 28 };
	public static int temp;
	public static int temp1;

	public static void main(String[] args) {
		for (int i = 0; i < str.length; i++) {
			if (temp < str[i]) {
				temp = str[i];
			}
		}
		for (int j = 0; j < str.length; j++) {
			temp1 = str[0];
			if (temp1 > str[j]) {
				temp1 = str[j];
			}
		}
		System.out.println(temp);
		System.out.println(temp1);
	}

}
