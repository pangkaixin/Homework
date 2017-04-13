package zhangwei;

import java.util.Arrays;
import java.util.Scanner;

public class L20170412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L20170412 A =new L20170412();
		Scanner sc=null;
		System.out.println("请输入：1冒泡 2英文排序 3最大值最小值");
		sc=new Scanner(System.in);
		int c=sc.nextInt();
     switch(c){
    	 case 1:
    		 L20170412.maopao();
         case 2:
        	 L20170412.yingwenpaixu();
        case 3:
        	 L20170412.maxmin();
        	
     }
		
			    public static void maopao(){
				int[] a={1,8,9,2,0,7,3,5,4,6,10,13,12,11};
				for(int i=0;i<a.length;i++){
				int temp=0;
					for(int j=0;j<a.length-i-1;j++){
					if(a[j]<a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					}
					}
				}for(int b=0;b<a.length;b++){
					System.out.print(a[b]+",");
					}
			}
		
		
		
			
			    	public static void yingwenpaixu() {
			    		String[] str={"a","c","b","d","h","f"};
			    		for(int i=1;i<str.length;i++){
			    			for(int j=0;j<str.length-i;j++){
			    				if(str[j].compareTo(str[j+1])>0){
			    					String temp;
			    					temp=str[j];
			    					str[j]=str[j+1];
			    					str[j+1]=temp;
			    				}
			    			}
			    		}
			    			for(int k=0;k<str.length;k++){
			    				System.out.print(str[k]+" ");
			    		}
			    	}
			 
		
		
			    
			    
			    
			    public static void maxmin(){
					int[] a=new int[]{21,3,6,8,33,15,10};
					Arrays.sort(a);
					for(int i=0;i<a.length;i++){
							//System.out.println(a[i]+",");
						if(i==0){
							System.out.println("此函数的最小值为："+a[0]);
						}else if(i==6){
							System.out.println("此函数的最大值为："+a[6]);
							}
					}		
				}	
		
		
		
     
     
	}

	private static void switch(int c) {
		// TODO Auto-generated method stub
		
	}

}
