package Work0417;

public class Names1 {
	public static void main(String[] args)
	{
		String tap="\t";	
		String dualTap="\t\t";
		String threeTap="\t\t\t";
		String fourTap="\t\t\t\t";
		String lineBreak="\r\n";
		String dualBlank=" ";	
		String[] province={"����","���","����","�Ϻ�","����"};
		String[][] city={{"������","����","˳��"},{"���","����","����"},{"����","����","����"},{"�Ϻ�","��ɽ","�ζ�"},{"�Ͼ�","��","����"}};
		String[][] no={{"101010100","101010300","101010400"},{"101030100","101030300","101030400"},{"101310101","101310201","101310202"},{"101020100","101020300","101020500"},{"101190101","101190301","101190401"}};
		StringBuffer sb=new StringBuffer();
		sb.append("{").append(lineBreak);
		sb.append(tap).append("\"���д���\":[").append(lineBreak);
		for(int i=0;i<province.length;i++)
		{
			sb.append(dualTap).append("{").append(lineBreak);
			sb.append(threeTap).append("\"ʡ\":").append(province[i]).append(",").append(lineBreak);
			sb.append(threeTap).append("\"��\":").append(lineBreak);
			for(int j=0;j<city[i].length;j++)
			{
				sb.append(threeTap).append(dualBlank).append("{").append(lineBreak);
				sb.append(fourTap).append("\"����\":").append(city[i][j]).append(",").append(lineBreak);
				sb.append(fourTap).append("\"����\":").append(no[i][j]).append(lineBreak);
				sb.append(threeTap).append(dualBlank).append("}").append(",").append(lineBreak);				
			}
			sb.deleteCharAt(sb.length()-3);
			sb.append(threeTap).append("]").append(lineBreak);
			sb.append(dualTap).append("}").append(lineBreak);
		}
		sb.deleteCharAt(sb.length()-3);
		sb.append(tap).append("]").append(lineBreak);
		sb.append("}");
		System.out.println(sb.toString());				
	}
}