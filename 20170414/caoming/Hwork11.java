package com.cheer;

public class Hwork11
{
	public static void main(String[] args)
	{
		String[] s1={"{","\n","\t","北京","\n","\t","编码:","101010100","\n","}"};
		for(int i=0;i<s1.length;i++)
		{
			StringBuffer a=new StringBuffer("");
			a.append(s1[i]);
			System.out.print(a.toString());
		}
		
	}
}
