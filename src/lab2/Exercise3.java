package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of Array");
		int n=sc.nextInt();
		System.out.println("enter Array elements");
		int[] array1=new int[n];
		for(int i=0;i<n;i++)
		{
			array1[i]=sc.nextInt();
		
		}
		int[] newarr=new int[n];
		newarr=getSorted(array1);
		System.out.println("sorted array");
		for(int i:newarr)
		{
			System.out.println(i);
		}
}

	private static int[] getSorted(int[] array1) {
		// TODO Auto-generated method stub
		//Reversing elements of Array
		for(int i=0;i<(int)array1.length/2;i++)
		{
			int temp=array1[i];
			array1[i]=array1[array1.length-i-1];
			array1[array1.length-i-1]=temp;
		}
		System.out.println("Reversed elements");
		for(int i:array1)
		{
			System.out.println(i);
		}
		System.out.println();
		//sort Array elements
		Arrays.sort(array1);
		
		return array1;
	}
}
