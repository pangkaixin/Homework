package wanghanyang;

import java.util.*;
public class Remove{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str=sc.next();
		System.out.println("请输入要删除的字符");
		String str1=sc.next();
		String newstr=str.replace(str1,"");
		System.out.println("删除后的字符串是:"+newstr);
	}
}