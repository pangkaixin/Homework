public class MaoPaoSorty
{
	public static void main(String[] args)
	{
		int[] unsorted={98,65,70,85,77};
		int temp=0;
		for (int i = 0; i < unsorted.length; i++)
      {
          for (int j = i; j < unsorted.length; j++)
          {
              if (unsorted[i] > unsorted[j])
              {
                  temp = unsorted[i];
                  unsorted[i] = unsorted[j];
                  unsorted[j] = temp;			
				  }		
			 }
	   }
		for(int i=0;i<unsorted.length;i++)
		{
			System.out.println(unsorted[i]);
		}
	}
}