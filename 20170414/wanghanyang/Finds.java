package wanghanyang;

import java.util.*;
public class Finds{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("�����������ַ���");
		String a=sc.next();
		System.out.println("��������Ҫ���ҵ��ַ�");
		String b=sc.next();
		for(int i=0;i<a.length();i++)
		{
			int j=a.indexOf(b,i);
			if(j==-1)
			{
				break;
			}
		System.out.println("����Ҫ���ҵ��ַ�λ����:"+j);
		i=j+b.length();
		}
	}
}