package lab6;

import java.util.*;
import java.util.Map.Entry;

public class Exercise2 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int n=sc.nextInt();
	System.out.println("enter characters");
	ArrayList<Character> str=new ArrayList<Character>();
	Map<Character,Integer> count=new HashMap<Character,Integer>();
	for(int i=0;i<n;i++)
	{
		String a=sc.next();
		str.add(a.charAt(0));
	}
	count.putAll(countChars(str));
	for(Entry<Character, Integer> i:count.entrySet())
	{
		System.out.println(i);
	}
	
	}
	//count characters 
	private static Map<Character,Integer> countChars(ArrayList<Character> str) {
		// TODO Auto-generated method stub
		Map<Character,Integer> count=new HashMap<Character,Integer>();
		for(char a:str)
		{
			if(!count.containsKey(a))
			{
				count.put(a, 1);
			}
			else
			{
				count.put(a, count.get(a)+1);
			}
		}
		return count;
		
		
	}
}
