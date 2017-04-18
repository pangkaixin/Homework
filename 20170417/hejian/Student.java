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
		student.name="张三";
		student.age="18岁";
		student.classs="三班";
		student.hobby="看书";
		student.play();
	}
}