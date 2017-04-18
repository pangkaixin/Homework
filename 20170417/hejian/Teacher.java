public class Teacher
{
	String name;
	String age;
	String major;
	String course;
	public void play()
	{
		System.out.println(name+"\n"+age+"\n"+major+"\n"+course);	
	}
	public static void main(String[] args)
	{
		Teacher teacher	=new Teacher();
		teacher.name="ÀîËÄ";
		teacher.age="10Äê";
		teacher.major="java";
		teacher.course="java";
		teacher.play();
	}
}