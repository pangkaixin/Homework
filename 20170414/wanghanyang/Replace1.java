package wanghanyang;

import java.util.*;
public class Replace1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String str=sc.next();
		System.out.println("������Ҫ�޸ĵ��ַ�");
		String str1=sc.next();
		System.out.println("����������Ҫ�滻�ɵ��ַ�");
		String str2=sc.next();
		String newstr=str.replace(str1,str2);
		System.out.println("�޸ĺ���ַ�����:"+newstr);
	}
}