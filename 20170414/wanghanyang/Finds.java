package wanghanyang;

import java.util.*;
public class Finds{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入您的字符串");
		String a=sc.next();
		System.out.println("请输入您要查找的字符");
		String b=sc.next();
		for(int i=0;i<a.length();i++)
		{
			int j=a.indexOf(b,i);
			if(j==-1)
			{
				break;
			}
		System.out.println("您需要查找的字符位置在:"+j);
		i=j+b.length();
		}
	}
}