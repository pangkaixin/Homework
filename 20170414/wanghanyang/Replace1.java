package wanghanyang;

import java.util.*;
public class Replace1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str=sc.next();
		System.out.println("请输入要修改的字符");
		String str1=sc.next();
		System.out.println("请输入您需要替换成的字符");
		String str2=sc.next();
		String newstr=str.replace(str1,str2);
		System.out.println("修改后的字符串是:"+newstr);
	}
}