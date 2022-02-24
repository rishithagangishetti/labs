package lab2;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Exercise2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of Array");
		int n=sc.nextInt();
		System.out.println("enter Array elements");
		String[] array1=new String[n];
			
		for(int i=0;i<n;i++)
		{
			array1[i]=sc.next();
		
		}
		
		for(String a:sortStrings(array1))
		{
			System.out.println(a);
		}
		
	}

	private static String[] sortStrings(String[] array1) {
		// TODO Auto-generated method stub
		//sort the array
		Arrays.sort(array1);
		String[] newarr=new String[array1.length];
		int n;
		//to check array length is odd or even
		if(array1.length%2==0)
		{
			n=(int)array1.length/2;
		}
		else
		{
			n=(int)(array1.length/2)+1;
		}
		//if array length is odd convert (n/2)+1 elements to upper case and remaining to lower case
		for(int i=0;i<array1.length;i++)
		{
			
			if(i<n)
			{
				newarr[i]=array1[i].toUpperCase();
			}
			else
			{
				newarr[i]=array1[i].toLowerCase();
			}
		}
		return newarr;
		
	}

}
