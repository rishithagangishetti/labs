package lab6;

import java.util.*;


public class Exercise1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		List<String> l=new ArrayList<String>();
		map.put(11, "abc");
		map.put(2, "pqr");
		map.put(33, "bat");
		map.put(24, "amith");
		System.out.println("before sorting");
		for(Map.Entry<Integer,String> a:map.entrySet())
		{
			System.out.println(a);
		}
		System.out.println("after sorting");
		l.addAll(sortedHashMap(map));
		for(String i:l)
		{
			System.out.println(i);
		}	
	}
		static List<String> sortedHashMap(HashMap<Integer,String> map1)
		{
			//create a list and TreeMap
			List<String> l=new ArrayList<String>();
			TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();
			//add elements to TreeMap to sort based on keys
			for(Map.Entry<Integer,String> a:map1.entrySet())
			{
				treemap.put(a.getKey(),a.getValue());
			}
			//add values to list
			l.addAll(treemap.values());
			return l;
		
		}
}
