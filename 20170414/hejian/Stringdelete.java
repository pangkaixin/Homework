
public class Stringdelete
{
	// 根据索引删除字符串中的字符
	public static void main(String[] args)
	{
		StringBuffer bf = new StringBuffer("gfdsahjkltrewqyuiop");
		bf.delete(5, 10);
		System.out.println(bf.toString());
	}
}
