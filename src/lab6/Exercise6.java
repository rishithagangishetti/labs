package lab6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		List<Integer> l=new ArrayList<Integer>(); 
		map.put(123, LocalDate.parse("2000-07-18").getYear());
		map.put(124, LocalDate.parse("1999-07-18").getYear());
		map.put(127, LocalDate.parse("2011-07-18").getYear());
		map.put(125, LocalDate.parse("1972-07-18").getYear());
		map.put(136, LocalDate.parse("1980-07-18").getYear());
		map.put(179, LocalDate.parse("2013-07-18").getYear());
		l=votersList(map);
		System.out.println("Ids of eligible voters");
		for(Integer i:l)
		{
			System.out.println(i);
		}
		
	}
	//add the eligible voters to list
	private static List<Integer> votersList(Map<Integer, Integer> map) {
		// TODO Auto-generated method stub
		//get current year
		 LocalDate lt= LocalDate.now(); 
		 int a=lt.getYear();
		List<Integer> l=new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> i:map.entrySet())
		{
			
			if(a-i.getValue()>=18)
			{
				l.add(i.getKey());
			}
		}
		return l;
	}

}
