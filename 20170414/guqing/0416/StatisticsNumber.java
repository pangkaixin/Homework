package homework;

import java.util.Scanner;

    public class StatisticsNumber {
    	public static void main(String[] args){
    	
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个由数字组成的字符串: " );
	String str=sc.next();
	System.out.println("请输入您需要查询的数字: " );
	char c=sc.next().charAt(0);

    char[] cs = str.toCharArray();
     int count = 0;

    for (int i = 0; i < cs.length; i++) {
    if (cs[i] == c) {
        count++;
    }
}
System.out.println("您查询的数字出现的次数为:"+count);
}
}
