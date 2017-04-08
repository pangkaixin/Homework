package com.jyc;
/*任务目标:让小朋友搬椅子，如果年龄大于7岁或者男孩大于5岁就可以，
否则提示不可以搬。*/
import java.util.Scanner;
public class Children
{
public static void main(String[] agrs)
	{
     Scanner input=new Scanner(System.in);
	 System.out.println("请输入小朋友的年龄:");
	 int age = input.nextInt();             
	 if(age>7)
	 {
	 System.out.println("可以搬");
	 }
	 else
	 {
	 System.out.println("不可以搬");
	 System.out.println("请问是否是男孩?(y/n):");
	 String children = input.next();
	 if(children.equals("y"))
	 {
	 if(age>5)
	 {
	 System.out.println("可以搬");
	 }
	 else
	 {
	 System.out.println("不可以搬");
	 }
	 }
	 else
	 {
	 System.out.println("不可以搬");
	 }
	 }
	}
}

