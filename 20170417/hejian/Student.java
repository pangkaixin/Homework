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
		student.name="ÕÅÈı";
		student.age="18Ëê";
		student.play();
	}
}