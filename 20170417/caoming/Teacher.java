public class Teacher
{
	 String name;
	 String profession;
	 String course;
	 int seniority;
	 public void show()
	 {
	 	System.out.print(name+"\n专业方向："+profession+"\n教授课程："+course+"\n教龄："+seniority);
	 }
	
	public static void main(String[] args)
	{
		Teacher t=new Teacher();
		t.name="王老师";
		t.profession="计算机";
		t.course="使用JAVA语言理解程序逻辑";
		t.seniority=5;
		t.show();
		
	} 
}