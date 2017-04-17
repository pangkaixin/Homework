package wanghanyang;

import java.util.*;
public class Shenfenzheng{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要查询生日的身份证号码:");
		String str=sc.next();
		String str1=str.substring(6,14);
		System.out.println("该身份证的生日是:"+str1);
	}
}