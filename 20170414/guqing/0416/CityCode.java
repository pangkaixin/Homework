package homework;

import java.util.Scanner;

public class CityCode {

	public static void main(String[] args) {
		//String[] str={"����","�����","�Ϻ�","����","����"};
		String d="101";
		Scanner sc = new Scanner(System.in);
		System.out.println("ʡ��: ");
		String t= sc.nextLine();
		StringBuffer strb = new StringBuffer(d);
		System.out.println("����: ");
		String q= sc.nextLine();
        if(t.equals("����"))
        {
        	switch(q){
        		case "����" : strb.append("010100");
        		System.out.println(strb.toString());
        		break;
        		case "����" : strb.append("010300");
        		System.out.println(strb.toString());
        		break;
        		case "˳��" : strb.append("010400");
        		System.out.println(strb.toString());
        		break;
        	}
        }
        
        else if(t.equals("�����")){
        	switch(q){
    		case "���" : strb.append("030100");
    		System.out.println(strb.toString());
    		break;
    		case "����" : strb.append("030300");
    		System.out.println(strb.toString());
    		break;
    		case "����" : strb.append("030400");
    		System.out.println(strb.toString());
    		break;
    	  }
    	}
        
        else if(t.equals("�Ϻ�")){
        	switch(q){
    		case "�Ϻ�" : strb.append("020100");
    		System.out.println(strb.toString());
    		break;
    		case "��ɽ" : strb.append("020300");
    		System.out.println(strb.toString());
    		break;
    		case "�ζ�" : strb.append("020500");
    		System.out.println(strb.toString());
    		break;
    		case "�ϻ�" : strb.append("020600");
    		System.out.println(strb.toString());
    		break;
    		case "�ֶ�" : strb.append("021300");
    		System.out.println(strb.toString());
    		break;
    	  }
	}
        
        else if(t.equals("����")){
        	switch(q){
    		case "����" : strb.append("310101");
    		System.out.println(strb.toString());
    		break;
    		case "����" : strb.append("310201");
    		System.out.println(strb.toString());
    		break;
    		case "����" : strb.append("310202");
    		System.out.println(strb.toString());
    		break;
    	  }
    	}
        
        else if(t.equals("����")){
        	switch(q){
    		case "�Ͼ�" : strb.append("190101");
    		System.out.println(strb.toString());
    		break;
    		case "��" : strb.append("190301");
    		System.out.println(strb.toString());
    		break;
    		case "����" : strb.append("190401");
    		System.out.println(strb.toString());
    		break;
    	  }
    	}
 }
	
}
