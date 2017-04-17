package homework;

public class ReplaceElement {
	static String a = "abcabcabc";
	public static void main(String[] args) {
		
		 String[] s = new String[a.length()];
		 
		 for(int i = 0; i < a.length(); i++){
			 s[i] = a.substring(i, i+1);
			if( s[i].equals("a"))
			{
				s[i]="d";
			}
			 System.out.println(s[i]);
		 }

	}

}
