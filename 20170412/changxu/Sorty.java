public class Sorty
{
	public static void main(String[] args)
	{
		int[] arrays={98,65,70,85,77};
		int temp=0;
		for(int i=0;i<arrays.length-1;i++)
		{
			if(arrays[i]>arrays[i+1])
			{
				arrays[i+1]=temp;
				temp=arrays[i];
				arrays[i]=arrays[i+1];
				System.out.println(arrays[i]);				
			}
				
		}
	}
}