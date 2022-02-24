package lab6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Exercise11 {
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
	//sort based on values
	private static List<String> sortedHashMap(HashMap<Integer, String> map) {
		// TODO Auto-generated method stub
		//create a list 
		
		List<Entry<Integer,String>> l=new ArrayList(map.entrySet());
		List l1=new ArrayList();
		Comparator<Entry<Integer,String>> c=new Comparator<Entry<Integer,String>>()
				{

					@Override
					public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
						// TODO Auto-generated method stub
						return o1.getValue().compareTo(o2.getValue());
					}
			
				};
		
		Collections.sort(l,c);
		System.out.println(l);
		for(Map.Entry<Integer,String> i:l)
		{
			l1.add(i.getValue());
		}
		return l1;
	}

}
