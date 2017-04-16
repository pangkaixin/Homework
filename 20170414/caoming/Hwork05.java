package com.cheer;

import java.util.Scanner;
/*  
 *  将一个字符串中的字符全部替换成指定字符，例如如abcabcabc，将所有a替换成d。
 */ 
public class Hwork05
{
	public static void main(String[] args)
	{
		String str="abcabcabc";
		String newstr=str.replace("a", "d");
		System.out.print(newstr);
				
		
	}
}
