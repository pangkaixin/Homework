package home1;
import java.util.Scanner;
public class CityNo
{
	public static void main(String[] args)
	{
		int cityNo=0;
		String city=" ";
		Scanner sc=null;
		StringBuffer eco=new StringBuffer("省：");
		StringBuffer cit=new StringBuffer("市名：");
		StringBuffer no=new StringBuffer("编号：");		
		boolean isSearch=true;
		while(isSearch)
		{
			StringBuffer sb=new StringBuffer("请选择你想要查看的省：\n");
			String province=sb.append("1:北京 2：天津市 3:上海 4:海南省 5：江苏");
			System.out.println(province);
			sc=new Scanner(System.in);
			int econNo=sc.nextInt();
			switch(econNo)
			{
				case 1:
				{
					String str1=eco.append("北京");
					System.out.println(str1);
					System.out.println("请输入您所要的市的编号：\n1.北京 2.朝阳 3.顺义");
					cityNo1=sc.nextInt();	
					switch(cityNo1)
					{
						case 1:
						{
							String a1=cit.append("北京");
							String BJNO1=no.append("101010100");
							System.out.println(a1+BJNO1);
							break;			
						}
						case 2:
						{
							String a2=cit.append("朝阳");
							String BJNO1=no.append("101010300");
							System.out.println(a2+BJNO2);
							break;			
						}
						case 3:
						{
							String a3=cit.append("顺义");
							String BJNO1=no.append("101010400");
							System.out.println(a3+BJNO3);
							break;			
						}			
					}	
				}
				case 2:
				{
					String str2=eco.append("天津市");
					System.out.println(str2);
					System.out.println("请输入您所要的市的编号：\n1.天津 2.宝坻 3.东丽");
					cityNo2=sc.nextInt();	
					switch(cityNo2)
					{
						case 1:
						{
							String b1=cit.append("天津");
							String TJNO1=no.append("101030100");
							System.out.println(b1+TJNO1);
							break;			
						}
						case 2:
						{
							String b2=cit.append("宝坻");
							String BJNO1=no.append("101030300");
							System.out.println(b2+TJNO2);
							break;			
						}
						case 3:
						{
							String b3=cit.append("东丽");
							String TJNO1=no.append("101030400");
							System.out.println(b3+TJNO3);
							break;			
						}			
					}	
				}
				case 3:
				{
					String str3=eco.append("上海");
					System.out.println(str3);
					System.out.println("请输入您所要的市的编号：\n1.上海 2.宝山 3.嘉定 4.南汇 5.浦东");
					cityNo3=sc.nextInt();	
					switch(cityNo3)
					{
						case 1:
						{
							String c1=cit.append("上海");
							String SHNO1=no.append("101020100");
							System.out.println(c1+SHNO1);
							break;			
						}
						case 2:
						{
							String c2=cit.append("宝山");
							String SHNO1=no.append("101020300");
							System.out.println(c2+SHNO2);
							break;			
						}
						case 3:
						{
							String c3=cit.append("嘉定");
							String SHNO1=no.append("101020500");
							System.out.println(c3+SHNO3);
							break;			
						}
						case 4:
						{
							String c4=cit.append("南汇");
							String SHNO1=no.append("101020600");
							System.out.println(c4+SHNO4);
							break;			
						}
						case 5:
						{
							String c5=cit.append("浦东");
							String SHNO1=no.append("101021300");
							System.out.println(c5+SHNO5);
							break;			
						}						
					}	
				}
				case 4:
				{
					String str4=eco.append("海南省");
					System.out.println(str4);
					System.out.println("请输入您所要的市的编号：\n1.海口 2.三亚 3.东方");
					cityNo4=sc.nextInt();	
					switch(cityNo4)
					{
						case 1:
						{
							String d1=cit.append("海口");
							String HNNO1=no.append("101310101");
							System.out.println(d1+HNNO1);
							break;			
						}
						case 2:
						{
							String d2=cit.append("三亚");
							String HNNO1=no.append("101310201");
							System.out.println(d2+HNNO2);
							break;			
						}
						case 3:
						{
							String d3=cit.append("东方");
							String HNNO1=no.append("101310202");
							System.out.println(d3+HNNO3);
							break;			
						}			
					}	
				}
				case 5:
				{
					String str5=eco.append("江苏");
					System.out.println(str5);
					System.out.println("请输入您所要的市的编号：\n1.南京 2.镇江 3.苏州");
					cityNo5=sc.nextInt();	
					switch(cityNo5)
					{
						case 1:
						{
							String e1=cit.append("南京");
							String JSNO1=no.append("101190101");
							System.out.println(e1+JSNO1);
							break;			
						}
						case 2:
						{
							String e2=cit.append("镇江");
							String JSNO2=no.append("101190301");
							System.out.println(e2+JSNO2);
							break;			
						}
						case 3:
						{
							String e3=cit.append("苏州");
							String JSNO3=no.append("101190401");
							System.out.println(e3+JSNO3);
							break;			
						}			
					}	
				}
			}
			System.out.println("是否继续查找：y/n");
			String inPuts=sc.next();
			if("n".equals(inPuts))
			{
				break;	
			}
		}
		sc.close();
	}
}
