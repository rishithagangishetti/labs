package lab6;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise7 {	
		public static void main(String[] args) {
			ArrayList<Integer> arr=new ArrayList<Integer>();
			arr.add(10);
			arr.add(11);
			arr.add(18);
			arr.add(20);
			arr.add(70);
			arr.add(90);
			arr.add(56);
			ArrayList<Integer> newarr=new ArrayList<Integer>();
			newarr=getSorted(arr);
			//After sorting
			System.out.println("sorted arraylist");
			for(int i:newarr)
			{
				System.out.println(i);
			}
	}

		static ArrayList<Integer> getSorted(ArrayList<Integer> array1) {
			// TODO Auto-generated method stub
			//Reversing elements of ArrayList
			for(int i=0;i<(int)array1.size()/2;i++)
			{
				int temp=array1.get(i);
				array1.set(i,array1.get(array1.size()-i-1));
				array1.set(array1.size()-i-1,temp);
			}
			
			System.out.println("reversed arraylist");
			for(int i:array1)
			{
				System.out.println(i);
			}
			Collections.sort(array1);
			return array1;
		}
	


}
