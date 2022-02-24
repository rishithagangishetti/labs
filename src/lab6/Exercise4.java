package lab6;

import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> student =new HashMap<Integer,Integer>();
		HashMap<Integer,String> medals =new HashMap<Integer,String>();
		student.put(12, 70);
		student.put(13, 80);
		student.put(15, 90);
		student.put(14, 80);
		student.put(17, 90);
		medals.putAll(getStudent(student));
		for(Map.Entry<Integer,String> i:medals.entrySet())
		{
			System.out.println(i);
		}
		
		
	}
	//base on marks secured assign medals
	private static HashMap<Integer,String> getStudent(HashMap<Integer, Integer> student) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> medals =new HashMap<Integer,String>();
		for(Map.Entry<Integer,Integer> i:student.entrySet())
		{
			if(i.getValue()>=90)
			{
				medals.put(i.getKey(),"gold");
			}
			else if(i.getValue()>=80 && i.getValue()<90)
			{
				medals.put(i.getKey(),"silver");
			}
			else 
			{
				medals.put(i.getKey(),"Bronze");
			}
			
		}
		return medals;
	}
}
