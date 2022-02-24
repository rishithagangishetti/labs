package lab3;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] a=s.split(" ");
		int[] arr=new int[a.length];
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			arr[i]=Integer.parseInt(a[i]);
		}
		System.out.println("array elements are");
		//print the array elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			sum=sum+arr[i];
		}
		//sum of array elements
		System.out.println("sum of elements"+sum);
	}

}
