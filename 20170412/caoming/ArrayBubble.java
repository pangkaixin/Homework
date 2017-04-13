package com.cheer;

class ArrayBubble
{
	public static void main(String[] args)
	{
		int[] iArr = {102,-200,3,10,9,-100,4};		
		for(int i = 0; i < iArr.length; i++)
		{	
			int temp = 0;
			for(int j = 0; j < iArr.length - i -1; j++)
			{				
				if(iArr[j] > iArr[j+1])
				{
					temp =  iArr[j];
					iArr[j] = iArr[j+1];
					iArr[j+1] = temp;
				}
			}
		}
		for(int i : iArr)
		{
			System.out.print(i + "  ");
		}
	}
}