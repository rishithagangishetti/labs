package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Exercise5 {

	public static int getSecondSmallest(ArrayList<Integer> a)
	{
		//sort ArrayList
		TreeSet<Integer> trset=new TreeSet();
		ArrayList<Integer> ar=new ArrayList();
		trset.addAll(a);
		ar.addAll(trset);
		return ar.get(1);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length of Array");
	int n=sc.nextInt();
	System.out.println("enter Array elements");
	ArrayList<Integer> arr=new ArrayList<Integer>();
	for(int i=0;i<n;i++)
	{
		arr.add(sc.nextInt());
	
	}

	System.out.println("second smallest number is" +getSecondSmallest(arr) );
}

}
