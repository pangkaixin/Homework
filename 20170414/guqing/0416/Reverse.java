package homework;

public class Reverse {
	public	static String s="abcdef";
	public	static String str="";
	public static void main(String[] args) {
		char[] l=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			str=str+l[i];
		}
		
			System.out.print(str);
	}
}
