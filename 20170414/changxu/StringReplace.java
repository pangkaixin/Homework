package home1;
public class StringReplace
{
	public static void main(String[] args)
	{
		StringBuffer words=new StringBuffer("abcdef");	
		words.replace(0,words.length(),"123");
		System.out.println(words.toString());
	}
}