public class Teacher
{
	String name;
	String age;
	public void play()
	{
		System.out.println(name+"\n"+age);	
	}
	public static void main(String[] args)
	{
		Teacher teacher	=new Teacher();
		teacher.name="����";
		teacher.age="38��";
		teacher.play();
	}
}