package home1;
import java.util.Scanner;
public class SearchA
{
	public static void main(String[] args)
	{
		Scanner sc=null;
		System.out.println("请输入一组字符串");
		sc=new Scanner(System.in);
		String words=sc.next();
		System.out.println("请输入您要搜索的字符");
		String str=sc.next();	
		if(words.indexOf(str)==-1){  
            System.out.println("没有找到指定内容");  
        }else{  
            System.out.println("可以找到指定内容");  
        }  	
		for(int i=0;i<words.length();i++)
		{
			String s=words.substring(i,i+1);		
			if(str.equals(s))
			{
				System.out.println("在下标为"+i+"时 出现该字符");	
			}
		}
		sc.close();
	}
}
