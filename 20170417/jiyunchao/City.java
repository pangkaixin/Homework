package day08;

public class City
{
	public static void main(String[] args)
	{
		String tap="\t";
		String doubleTap="\t\t";
		String threeTap="\t\t\t";
		String fourTap="\t\t\t\t";
		String lineBreak="\r\n";
		String doubleBlank="  ";
		String[] provinces={"北京","天津","上海","海南","江苏"};	
	
		String[][]	cityName = {{"北京","朝阳","顺义"},{"天津","宝坻","东丽"},{"上海","宝山","嘉定"},{"海口","三亚","东方"},{"南京","镇江","苏州"}};
		String[][] CityNum={{"101010100","101010300","101010400"},{"101030100","101030300","101030400"},{"101020100","101020300","101020500"},{"101310101","101310201","101310202"},{"101190101","101190301","101190401"}};
		
		StringBuffer sb=new StringBuffer();
		sb.append("{").append(lineBreak);
		sb.append(tap).append("\"城市代码\":[").append(lineBreak);
		for(int i=0;i<provinces.length;i++)
		{
			sb.append(doubleTap).append("{").append(lineBreak);
			sb.append(threeTap).append("\"省\"：").append(provinces[i]).append(",").append(lineBreak);
			sb.append(threeTap).append("\"市\":[").append(lineBreak);
			for(int j=0;j<cityName[i].length;j++)	
			{	
			sb.append(threeTap).append(doubleBlank).append("{").append(lineBreak);	
			sb.append(fourTap).append("\"市名\":").append(cityName[i][j]).append(",")	;
			sb.append(fourTap).append("\"编码\":").append(CityNum[i][j]).append(lineBreak);
			sb.append(threeTap).append(doubleBlank).append("}").append(",").append(lineBreak);
			}	
			sb.deleteCharAt(sb.length()-3);
			sb.append(threeTap).append("]").append(lineBreak);
			sb.append(doubleTap).append("},").append(lineBreak);
		}
		sb.deleteCharAt(sb.length()-3);
		sb.append(tap).append("]").append(lineBreak);
		sb.append("}");
		System.out.println(sb.toString());
	}
}
