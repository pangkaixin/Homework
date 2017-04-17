
public class Stringreplace
{
	// 将字符串中的字符全部替换成指定字符
	public static void main(String[] args)
	{
		String str = "abcdefabcdefabcdefabcdef";
		String newstr = str.replace("a", "A");
		System.out.println(newstr);
	}
}
