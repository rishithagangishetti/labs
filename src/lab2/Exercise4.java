package lab2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of Array");
		int n=sc.nextInt();
		System.out.println("enter Array elements");
		int[] array1=new int[n];
		for(int i=0;i<n;i++)
		{
			array1[i]=sc.nextInt();
		
		}
		Arrays.sort(array1);
		int[] newarr=modifyArray(array1);
		for(int i=0;i<(int)newarr.length/2;i++)
		{
			int temp=newarr[i];
			newarr[i]=newarr[newarr.length-i-1];
			newarr[newarr.length-i-1]=temp;
		}
		for(int i:newarr)
		{
			if(i!=0)
			System.out.println(i);
		}
		
	}
	//remove duplicate and sort
	private static int[] modifyArray(int[] array1) {
		// TODO Auto-generated method stub
		int[] array2=new int[array1.length];
		int j=0,i=0;
		//remove duplicates
		for(i=0;i<array1.length-1;i++)
		{
			
				if(array1[i]!=array1[i+1])
				{
					array2[j]=array1[i];
					j++;
				}
			
		}
		array2[j]=array1[array1.length-1];
		Arrays.sort(array2);
		return array2;
	}

}
