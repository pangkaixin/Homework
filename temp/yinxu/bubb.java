package shuzu;

public class bubb {
      public static void main(String[] args){
    	  
    	  int []arr=new int[]{6,8,2,4,7,1};
    	  for(int i=0;i<arr.length-1;i++){
    		  for(int j=0;j<arr.length-1-i;j++){
    			  int temp=0;
    			      if(arr[j]>arr[j+1]){
    			    	  
    			    	  temp=arr[j];
    			    	  arr[j]=arr[j+1];
    			    	  arr[j]=temp;
    			      }
    		  }
    		  
    	  }
    	  for(int k=0;k<arr.length;k++){
    		  System.out.print(arr[k]+" ");
    	  }
    	  
    	  
      }
      
}
