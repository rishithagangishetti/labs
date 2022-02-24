/**
 * 
 */
package lab3;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Declare a StringBuffer
		StringBuffer sb=new StringBuffer(sc.next());
		System.out.print(getImage(sb));
	}

	private static StringBuffer getImage(StringBuffer sb) {
		// TODO Auto-generated method stub
		//Declare a new StringBuffer
		StringBuffer sb2=new StringBuffer(sb);
		sb2.append('|');
		//reverse and append
		sb2.append(sb.reverse());
		return sb2;
	}

}
