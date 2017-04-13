package com.cheer;

public class ArrayCharSelect
{
	public static void main(String[] args)
	{
		char[] iArry={'q','d','a','p','x'};
		int index;
		for(int i=1;i<iArry.length;i++)
		{
			index=0;
			for(int j=1;j<=iArry.length-i;j++)
			{
				if(iArry[j]>iArry[index])
				{
					index=j;
				}
			}
			char temp=iArry[iArry.length-i];
			iArry[iArry.length-i]=iArry[index];
			iArry[index]=temp;
		}
		for (int i = 0; i < iArry.length; i++)
		{
			System.out.print(iArry[i] + "\t");
		}
	}
}
