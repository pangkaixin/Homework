package learnJDBC;

public class EngishPx {
	public static void main(String[] args) {
		String[] str = { "w", "f", "b", "v", "s", "a" };
		for (int i = 1; i < str.length; i++) {
			for (int j = 0; j < str.length - i; j++) {
				if (str[j].compareTo(str[j + 1]) > 0) {
					String temp;
					temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
		for (int k = 0; k < str.length; k++) {
			System.out.print(str[k] + " ");
		}
	}
}