package home1;
public class StringDelete
{
	public static void main(String[] args)
	{
		StringBuffer words=new StringBuffer("abcdefghijhhh");
		words.delete(1,5);
		System.out.println(words.toString());		
	}
}