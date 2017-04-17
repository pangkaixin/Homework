package home1;
import java.util.Scanner;
public class StringCounter
{
	public static void main(String[] args)
	{
		Scanner sc=null;
		int count=0;
		System.out.println("请输入一组字符串：");
		sc=new Scanner(System.in);
		String words=sc.next();
		System.out.println("请输入要搜索的字符串：");
		String str=sc.next();
		String[] s=new String[words.length()];
		for(int i=0;i<words.length();i++)
		{
			s[i]=words.substring(i,i+1);		
			if(str.equals(s[i]))
			{
				count++;
			}
		}
		System.out.println(str+"共出现"+count+"次");
		sc.close();
	}
}