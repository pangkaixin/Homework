
public class Intobtain
{
	// 从身份证号码中获取生日，并打印出来
	public static void main(String[] args)
	{
		String bf = "421300199401016789";
		String subbf = bf.substring(10, 14);
		System.out.println(subbf);
	}
}
