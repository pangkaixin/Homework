import java.io.*;
public class Hwork06
{
	public static void main(String[] args)
	{
		String Str = new String("abcdef");
		try
		{
			byte[] Str1 = Str.getBytes();
			System.out.println("返回值:" +Str1 );
			Str1 = Str.getBytes("UTF-8");
			System.out.println("返回值:"+Str1);
			Str1 = Str.getBytes("gbk");
			System.out.println("返回值:"+Str1);
		}
		catch ( UnsupportedEncodingException e){
			System.out.println("不支持的字符集");
		}
		
	}
}