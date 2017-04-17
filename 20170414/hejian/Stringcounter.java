
public class Stringcounter
{
	// 字符串反转
	public static void main(String[] args)
	{
		String str = "abcdefg";
		for (int i = str.length() - 1; i >= 0; i--)
		{
			char c = str.charAt(i);
			System.out.print(c);
		}
		System.out.println();
	}
}
