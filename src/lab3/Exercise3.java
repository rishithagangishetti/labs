package lab3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc=new Scanner(System.in);
				//Declare a StringBuffer
				StringBuffer sb=new StringBuffer(sc.next());
				System.out.print(alterString(sb));
	}

	private static StringBuffer alterString(StringBuffer sb) {
		// TODO Auto-generated method stub
		StringBuffer temp=new StringBuffer(sb.length());
		
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u')
			{
				temp.append(sb.charAt(i));
			}
			else
			{
				temp.append((char)(sb.charAt(i)+1));
			}
		
		}
		return temp;
	}
}
