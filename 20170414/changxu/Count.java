package home1;
import java.util.Scanner;
public class Count
{
	public static void main(String[] args)
	{
		String words="1239586838923173478943890234092";	
		Scanner sc=null;
		System.out.println("请输入你要查询的数：");
		sc=new Scanner(System.in);
		String str=sc.next();
		String[] s=new String[words.length()];
		int i=0;
		int count=0;
		for(;i<words.length();i++)
		{
			s[i]=words.substring(i,i+1);
			if(s[i].equals(str))
			{
				count++;
			}	
		}
		sc.close();
		System.out.println(str+"共出现"+count+"次");
	}
}