package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Exercise3 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int n=sc.nextInt();
	System.out.println("enter numbers");
	ArrayList<Integer> str=new ArrayList<Integer>();
	Map<Integer,Integer> count=new HashMap<Integer,Integer>();
	for(int i=0;i<n;i++)
	{
		str.add(sc.nextInt());
	}
	count.putAll(getSquares(str));
	for(Entry<Integer, Integer> i:count.entrySet())
	{
		System.out.println(i);
	}
	
	}
	//numbers as keys and squares of numbers as values
	private static Map<Integer,Integer> getSquares(ArrayList<Integer> str) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> number=new HashMap<Integer,Integer>();
		for(int a:str)
		{
				number.put(a, a*a);	
		}
		return number;
	}
	}
