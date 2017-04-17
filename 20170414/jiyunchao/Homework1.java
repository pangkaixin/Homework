package com.jyc;

import java.util.Scanner;
public class Homework1  //问题
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str = sc.next();
         
        System.out.print("请输入一个子串:");
        String str1 = sc.next();
         
        int start = 0;
        while (true)
        {
            int i = str.indexOf(str1,start);
            if (i==-1)
            {
                break;
            }
            System.out.print(i+"\t");
            start = i+str1.length();
        }  
    }
}
