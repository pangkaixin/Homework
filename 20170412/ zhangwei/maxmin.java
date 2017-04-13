import java.util.Arrays;
public class MaxMin{
		public static void main(String[] args){
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