public class Student
{
	String name;
	String age;
	public void play()
	{
		System.out.println(name+"\n"+age);	
	}
	public static void main(String[] args)
	{
		Student student	=new Student();
		student.name="����";
		student.age="18��";
		student.play();
	}
}