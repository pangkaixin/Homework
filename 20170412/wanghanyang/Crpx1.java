package learnJDBC;

import java.util.*;

public class Crpx1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[6];
		a[0] = 99;
		a[1] = 85;
		a[2] = 63;
		a[3] = 54;
		a[4] = 60;
		a[5] = 0;
		int index = a.length;
		System.out.println("请输入新增成绩");
		int b = input.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (b > a[i]) {
				index = i;
				break;
			}
		}
		for (int i = a.length - 1; i > index; i--) {
			a[i] = a[i - 1];
		}
		a[index] = b;
		//System.out.println("插入成绩的下标：" + index);
		System.out.println("插入成绩后排序:");
		// for(int i=0;i<a.length;i++){
		// System.out.println(a[i]+" ");
		// }
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
}