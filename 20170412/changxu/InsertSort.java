public class InsertSort
{
	public static void main(String[] args)
	{
		int[] unsorted={7,6,23,45,18,69,72};
		for (int i = 1; i < unsorted.length; i++)      
      {
         if (unsorted[i - 1] >unsorted[i])         
         {
             int temp = unsorted[i];             
             int j = i;                              
             while (j >  0 && unsorted[j - 1] > temp)
             {
                unsorted[j] = unsorted[j - 1];     
                j--;                            
             }
                unsorted[j] = temp;                
         }         
      }
      for(int i=0;i<unsorted.length;i++)
      {
      	System.out.println(unsorted[i]);
      }
	}
}
