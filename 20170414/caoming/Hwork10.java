package com.cheer;
import java.util.Scanner;
/*  
 *  根据索引删除字符串中的字符。
 */ 
public class Hwork10
{
	//public static void main(String[] args)
	//{
	//	String str="我是一只小小鸟，想要飞的高";
	//	String newstr=str.replace("小小","");
	//	System.out.print(newstr);
	//}
	
	public static void main(String[] args)
	{
		String str="我是一只小小鸟，想要飞的高";
		String newstr1=str.substring(0,3);
		String newstr2=str.substring(6,13);
		System.out.print(newstr1+newstr2);
	}
	
}
