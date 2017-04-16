package home1;
public class SortString
{
	public static void main(String[] args)
	{
		String str="aredfyhijklm";
		String[] s=new String[str.length()];	
		for(int i=0;i<str.length();i++)
		{
			s[i]=str.substring(i,i+1);						
		}
		for(int i=1;i<str.length();i++)
		{
			for(int j=0;j<str.length()-i;j++)
			{
				if(s[j].compareTo(s[j+1])>0)
				{
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		for(int i=0;i<str.length();i++)
		{
			System.out.println(s[i]);
		}
	}
}