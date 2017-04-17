package day08;

public class Student
{
	String name;
	String age;
	String classes;
	String hobby;

	public void show()
	{
		System.out.println(name + "\n" + age + "\n" + classes + "\n" + hobby + "\n");
	}

	public static void main(String args[])
	{
		Student student = new Student();
		student.name = "张浩";
		student.age = "年龄:10";
		student.classes = "就读于:S1班";
		student.hobby = "爱好:篮球";
		student.show();
	}
}
