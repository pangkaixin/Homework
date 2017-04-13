package 作业;

public class charupaixu {
	public static int[] str = { 5, 8, 63, 4, 6, 7, 54, 9, 10, 28 };
	public static int temp;

	public static void main(String[] args) {

		for (int j = 1; j < str.length; j++) {
			if (str[j] < str[j - 1]) { // 后小前大进入While
				temp = str[j]; // 小的数赋值给临时
				while (j > 0 && str[j - 1] > temp) {// 大的是否大于临时值
					str[j] = str[j - 1];// 大的赋值给小的
					j--;
				}
				str[j] = temp;// 把临时值此时的j位值，此时j=0
			}
		}
		for (int k = 0; k < str.length; k++) {
			System.out.print(str[k] + "  ");
		}
	}
}
