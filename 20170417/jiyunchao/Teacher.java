package day08;

public class Teacher
{
	String name;
	String major;
	String course;
	String age;

	public void show()
	{
		System.out.println(name + "\n" + major + "\n" + course + "\n" + age);
	}

	public static void main(String args[])
	{
		Teacher teacher = new Teacher();

		teacher.name = "王老师";
		teacher.major = "专业方向:计算机";
		teacher.course = "教授课程:使用java语言理解程序逻辑";
		teacher.age = "教龄:5";
		teacher.show();
	}
}
