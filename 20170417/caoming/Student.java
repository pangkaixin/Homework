public class Student
{
	 String name;
	 int age;
	 String grade;
	 String interest;
	 public void show()
	 {
	 	System.out.print(name+"\n年龄："+age+"\n就读于："+grade+"\n爱好："+interest);
	 }
	
	public static void main(String[] args)
	{
		Student s=new Student();
		s.name="李明";
		s.age=18;
		s.grade="s1";
		s.interest="playball";
		s.show();
		
	} 

	
	
	
}