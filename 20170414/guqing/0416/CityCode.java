package homework;

import java.util.Scanner;

public class CityCode {

	public static void main(String[] args) {
		//String[] str={"北京","天津市","上海","海南","江苏"};
		String d="101";
		Scanner sc = new Scanner(System.in);
		System.out.println("省名: ");
		String t= sc.nextLine();
		StringBuffer strb = new StringBuffer(d);
		System.out.println("市名: ");
		String q= sc.nextLine();
        if(t.equals("北京"))
        {
        	switch(q){
        		case "北京" : strb.append("010100");
        		System.out.println(strb.toString());
        		break;
        		case "朝阳" : strb.append("010300");
        		System.out.println(strb.toString());
        		break;
        		case "顺义" : strb.append("010400");
        		System.out.println(strb.toString());
        		break;
        	}
        }
        
        else if(t.equals("天津市")){
        	switch(q){
    		case "天津" : strb.append("030100");
    		System.out.println(strb.toString());
    		break;
    		case "宝坻" : strb.append("030300");
    		System.out.println(strb.toString());
    		break;
    		case "东丽" : strb.append("030400");
    		System.out.println(strb.toString());
    		break;
    	  }
    	}
        
        else if(t.equals("上海")){
        	switch(q){
    		case "上海" : strb.append("020100");
    		System.out.println(strb.toString());
    		break;
    		case "宝山" : strb.append("020300");
    		System.out.println(strb.toString());
    		break;
    		case "嘉定" : strb.append("020500");
    		System.out.println(strb.toString());
    		break;
    		case "南汇" : strb.append("020600");
    		System.out.println(strb.toString());
    		break;
    		case "浦东" : strb.append("021300");
    		System.out.println(strb.toString());
    		break;
    	  }
	}
        
        else if(t.equals("海南")){
        	switch(q){
    		case "海口" : strb.append("310101");
    		System.out.println(strb.toString());
    		break;
    		case "三亚" : strb.append("310201");
    		System.out.println(strb.toString());
    		break;
    		case "东方" : strb.append("310202");
    		System.out.println(strb.toString());
    		break;
    	  }
    	}
        
        else if(t.equals("江苏")){
        	switch(q){
    		case "南京" : strb.append("190101");
    		System.out.println(strb.toString());
    		break;
    		case "镇江" : strb.append("190301");
    		System.out.println(strb.toString());
    		break;
    		case "苏州" : strb.append("190401");
    		System.out.println(strb.toString());
    		break;
    	  }
    	}
 }
	
}
