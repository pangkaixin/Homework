package ��ҵ;

public class charupaixu {
	public static int[] str = { 5, 8, 63, 4, 6, 7, 54, 9, 10, 28 };
	public static int temp;

	public static void main(String[] args) {

		for (int j = 1; j < str.length; j++) {
			if (str[j] < str[j - 1]) { // ��Сǰ�����While
				temp = str[j]; // С������ֵ����ʱ
				while (j > 0 && str[j - 1] > temp) {// ����Ƿ������ʱֵ
					str[j] = str[j - 1];// ��ĸ�ֵ��С��
					j--;
				}
				str[j] = temp;// ����ʱֵ��ʱ��jλֵ����ʱj=0
			}
		}
		for (int k = 0; k < str.length; k++) {
			System.out.print(str[k] + "  ");
		}
	}
}
