package YunSuanDemo;

import java.util.Scanner;
public class Plane{
    public static void main(String[] args){
    	 System.out.println("请输入原票价格");
    	 Scanner sc  = new Scanner(System.in);
    	 int a = sc.nextInt();  	 
    	 System.out.println("请输入月份 1~12");
    	 Scanner sc1 = new Scanner(System.in);
    	 int b = sc1.nextInt();   	 
    	 System.out.println("请输入 1或2  【1：头等舱  2：经济舱】 ");
    	 Scanner sc2 = new Scanner(System.in);
    	 int c = sc2.nextInt();  	  
    	 switch(c){
    	 case 1:
    	 if(b>0&&b<4||b>10&&b<=12){
    	 System.out.println("经济舱淡季价格为："+a*0.3);
    	 break;   	     	
    	 }else{
    	 if(b>4&&b<=10){
    	 System.out.println("经济舱旺季价格为："+a*0.75);
    	 break;   	     	
    	 }
    	 }
    	 case 2:
    	 if(b>0&&b<4||b>10&&b<=12){
    	 System.out.println("头等舱淡季价格为："+a*0.6);  
    	 break;  	    	
    	 }else{
    	 if(b>4&&b<=10){
    	 System.out.println("头等舱旺季价格为："+a*0.9);
    	 break;
    	 }
    	 }	
    }
    }
}


