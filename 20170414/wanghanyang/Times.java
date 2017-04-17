package wanghanyang;

import java.util.*;
public class Times{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个由数字组成的字符串");
		String str=sc.next();
		System.out.println("请输入您需要查询的数字");
		char c=sc.next().charAt(0);
 
    char[] cs = str.toCharArray();//转换为char数组
    int count = 0;//计数器
    //从0开始遍历字符数组
    for (int i = 0; i < cs.length; i++) {
        if (cs[i] == c) {//如果当前字符等于目标字符
            count++;//计数器加1
        }
    }
    System.out.println("您查询的数字出现的次数为:"+count);//打印结果
  }
}