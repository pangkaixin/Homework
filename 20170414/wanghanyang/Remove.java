package wanghanyang;

import java.util.*;
public class Remove{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String str=sc.next();
		System.out.println("������Ҫɾ�����ַ�");
		String str1=sc.next();
		String newstr=str.replace(str1,"");
		System.out.println("ɾ������ַ�����:"+newstr);
	}
}