package homework;

public class IndexesDelete {

	public static void main(String[] args) {
		 String a="123958";
		 StringBuffer str = new StringBuffer(a);
		 str.delete(3,5);
		System.out.println(str.toString());

	}

}
