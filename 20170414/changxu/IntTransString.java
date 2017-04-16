package home1;
public class IntTransString
{
	public static void main(String[] args)
	{
		int i =100;
    	Integer a =i;
    	String s =a.toString();//得包装起来才能转化，变量不可以to.String
		System.out.println(s);
		
	}
}
