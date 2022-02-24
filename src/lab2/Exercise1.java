package lab2;
import java.util.*;
public class Exercise1 {
	//To Find the second smallest number in given array
	public static int getSecondSmallest(int[] a)
	{
		Arrays.sort(a);
		return a[1];
	}
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

	System.out.println("second smallest number is" +getSecondSmallest(array1) );
}
}
