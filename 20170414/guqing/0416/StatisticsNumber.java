package homework;

import java.util.Scanner;

    public class StatisticsNumber {
    	public static void main(String[] args){
    	
	Scanner sc=new Scanner(System.in);
	System.out.println("������һ����������ɵ��ַ���: " );
	String str=sc.next();
	System.out.println("����������Ҫ��ѯ������: " );
	char c=sc.next().charAt(0);

    char[] cs = str.toCharArray();
     int count = 0;

    for (int i = 0; i < cs.length; i++) {
    if (cs[i] == c) {
        count++;
    }
}
System.out.println("����ѯ�����ֳ��ֵĴ���Ϊ:"+count);
}
}
