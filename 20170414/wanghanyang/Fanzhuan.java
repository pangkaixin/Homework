package wanghanyang;

import java.util.*;
public class Fanzhuan{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str=sc.next();
		for(int i=str.length()-1;i>=0;i--);
		StringBuffer a=new StringBuffer(str);
		System.out.println("反转之后的字符串是:"+a.reverse().toString());
	}
}