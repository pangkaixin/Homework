package zhangwei;

class Teach
{			public void solve()
	{
			Teacher a=new Teacher("王老师","5","计算机","使用java语言理解程序逻辑");
			Students b=new Students("张浩","10","51班","篮球");
			System.out.println(a.name+" "+"年龄:"+a.age+" "+"专业方向："+a.prod+" "+"教授课程："+a.course);
			System.out.println(b.name+" "+"年龄:"+b.age+" "+"就读于："+b.classname+" "+"爱好："+b.interest);
		}
		public static void main(String[] args)
		{
			Teach z=new Teach();
			z.solve();
			}

	
}