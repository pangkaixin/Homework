public class Student
{
	String name;
	String age;
	String classs;
	String hobby;
	public void play()
	{
		System.out.println(name+"\n"+age+"\n"+classs+"\n"+hobby);	
	}
	public static void main(String[] args)
	{
		Student student	=new Student();
		student.name="����";
		student.age="18��";
		student.classs="����";
		student.hobby="����";
		student.play();
	}
}